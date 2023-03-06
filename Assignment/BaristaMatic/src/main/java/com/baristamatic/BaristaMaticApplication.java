package com.baristamatic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.baristamatic.util.InventoryService;
import com.baristamatic.util.MenuCard;

@SpringBootApplication
public class BaristaMaticApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BaristaMaticApplication.class, args);

		runMachine();
		
		System.exit(1);
	}

	//////////////////////////


	public static void runMachine() {
		InventoryService inventory = new InventoryService();
		MenuCard menu = new MenuCard(inventory);
		inventory.display();
		menu.display();
		boolean stop = false;
		while (!stop) {
			
			System.out.println("******************************************************************************************");
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			while (line.equals("")) {
				try {
					line = bufferedReader.readLine();
				} catch (Exception e) {
					throw new RuntimeException();
				}
			}
			char c = (line.length() > 1) ? 'E' : line.charAt(0);

			try {
				switch (c) {
				case 'R':
					inventory.restock();
					inventory.display();
					menu.display();
					break;
				case 'r':
					inventory.restock();
					inventory.display();
					menu.display();
					break;
				case 'Q':
					stop = true;
					break;
				case 'q':
					stop = true;
					break;
				case '1':

					menu.makeDrink(0);

					inventory.display();
					menu.display();
					break;
				case '2':
					menu.makeDrink(1);
					inventory.display();
					menu.display();
					break;
				case '3':
					menu.makeDrink(2);
					inventory.display();
					menu.display();
					break;
				case '4':
					menu.makeDrink(3);
					inventory.display();
					menu.display();
					break;
				case '5':
					menu.makeDrink(4);
					inventory.display();
					menu.display();
					break;
				case '6':
					menu.makeDrink(5);
					inventory.display();
					menu.display();
					break;
				default:
					System.out.println("Invalid Input: " + line);
					inventory.display();
					menu.display();
					break;
				}

			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
				inventory.display();
				menu.display();
			}
			
			System.out.println("******************************************************************************************");
			
		}
	}



	//////////////////////////////


}
