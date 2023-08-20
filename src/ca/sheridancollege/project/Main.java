/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Manjot Singh
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> playerNames = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter Player " + i + "'s name: ");
            String playerName = scanner.nextLine();
            playerNames.add(playerName);
        }

        UNOGame unoGame = new UNOGame("UNO");

        for (String playerName : playerNames) {
            unoGame.getPlayers().add(new UNOPlayer(playerName));
        }

        unoGame.play();
        unoGame.declareWinner();
    }
}
