package com.timejh.bbs;

import java.util.Scanner;

/**
 * 게시판 관리 프로그램
 * 
 * @author tokijh
 *
 */
public class MainBbs {

	public static void main(String[] args) {
		MainBbs mainBbs = new MainBbs();
		mainBbs.run();
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("명령어를 입력 하세요.\n 1. create\n 2. read\n 3. update\n 4. delete\n 99. exit");
			switch (scanner.next()) {
			case "1":
				createBbs(scanner);
				break;
			case "2":
				readBbs(scanner);
				break;
			case "3":
				updateBbs(scanner);
				break;
			case "4":
				deleteBbs(scanner);
				break;
			case "99":
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력 했습니다.");
			}
		}
	}

	private Bbs inputBbs(Scanner scanner) {
		Bbs bbs = new Bbs();
		System.out.println("-------------------------------------------");
		System.out.print("Title : ");
		bbs.setTitle(scanner.next());
		System.out.print("Content : ");
		String content = "";
		while (true) {
			String line = scanner.nextLine();
			if (line.equals(":q")) {
				content = content.substring(0, content.length() - 1);
				break;
			}
			content += line + '\n';
		}
		bbs.setContent(content);
		System.out.print("Author : ");
		bbs.setAuthor(scanner.next());
		System.out.println("-------------------------------------------");
		return bbs;
	}

	private void createBbs(Scanner scanner) {
		BbsController.shared().create(inputBbs(scanner));
	}

	private void readBbs(Scanner scanner) {
		while (true) {
			System.out.println(" 1. readAll\n 2. read\n 3. cancel");
			switch (scanner.next()) {
			case "1":
				for (Bbs item : BbsController.shared().readAll())
					item.print();
				return;
			case "2":
				System.out.print("번호를 입력하세요.");
				BbsController.shared().read(parseInt(scanner.nextLine())).print();
				return;
			case "3":
				System.out.println("취소합니다.");
				return;
			default:
				System.out.println("잘못 입력 했습니다.");
			}
		}
	}

	private void updateBbs(Scanner scanner) {
		BbsController.shared().update(inputBbs(scanner));
	}

	private void deleteBbs(Scanner scanner) {
		System.out.print("번호를 입력하세요.");
		BbsController.shared().delete(parseInt(scanner.nextLine()));
	}
	
	private int parseInt(String value) {
		try {
			return Integer.parseInt(value);
		} catch (Exception e) {
			return -1;
		}
	}
}
