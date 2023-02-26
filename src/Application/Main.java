package Application;

import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

import entities.Comment;
import entities.Post;

public class Main {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		Comment c1 = new Comment("tripa seca");
		
		Date dataAtual = new Date();
		
		System.out.println("Titulo: " + "\n");
		String title = sc.nextLine();
		System.out.println("Comente: " + "\n");
		String content = sc.nextLine();
		Integer likes = 0;
		Post post = new Post(dataAtual, title, content, likes);
		
		post.addComment(c1);
		System.out.println(c1);
		
		System.out.println("---------------------------");
		
		System.out.println(post);
		
		System.out.println("---------------------------");
		
		
		
		
		sc.close();
	}

}
