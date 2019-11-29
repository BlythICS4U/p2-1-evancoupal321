/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p21;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author User
 */
public class P21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("QUESTION 1");
        int[] numList1 = new int[10]; //Declare Variable
        System.out.println("Enter ten numbers.");
        for (int i = 0; i < 10; i++) //Input
        {
            numList1[i] = scan.nextInt();
        }
        for (int i = 9; i >= 0; i--) //Output
        {
            System.out.println(numList1[i]);
        }
        System.out.println();
        System.out.println("QUESTION 2");
        int amount, smallest, largest, sum; //Declare Variables
        double average;
        System.out.println("How many numbers would you like to enter?");
        amount = scan.nextInt(); //Input
        int[] numList2 = new int[amount];
        System.out.println("Enter your " + amount + " numbers.");
        for (int i = 0; i < amount; i++)
        {
            numList2[i] = scan.nextInt();
        }
        smallest = getSmallest(numList2); //Arithmetic
        largest = getLargest(numList2);
        average = getAverage(numList2);
        System.out.println("Smallest: " + smallest); //Output
        System.out.println("Largest: " + largest);
        System.out.println("Average: " + average);
        System.out.println();
        System.out.println("QUESTION 3");
        int deckNum, suit = -1, card = -1; //Declare Variables
        int[][] cardName = {
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25},
            {26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38},
            {39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51}
        };
        System.out.println("Enter a number from 0 to 51."); //Input
        deckNum = scan.nextInt();
        for (int i = 0; i < 4; i++) //Arithmetic
        {
            for (int j = 0; j < 13; j++)
            {
                if (cardName[i][j] == deckNum)
                {
                    suit = i;
                    card = j;
                    break;
                }
            }
        }
        System.out.println(cardName(suit, card)); //Output
        System.out.println();
        System.out.println("QUESTION 4");
        int[] deck = new int[52]; //Declare Variables
        for (int i = 0; i < 52; i++) //Input
        {
            deck[i] = i;
        }
        deck = deckSwap(rand, deck); //Logic/Output
        System.out.println("After 1 swap:");
        printDeck(deck);
        for (int i = 0; i < 9; i++)
        {
            deck = deckSwap(rand, deck);
        }
        System.out.println();
        System.out.println("After 10 swaps:");
        printDeck(deck);
        for (int i = 0; i < 90; i++)
        {
            deck = deckSwap(rand, deck);
        }
        System.out.println();
        System.out.println("After 100 swaps:");
        printDeck(deck);
        System.out.println();
        System.out.println("QUESTION 5");
        int[] hand1 = new int[5]; //Declare Variables (Deck from question 4 was reused, as if question 4 was used to shuffle the deck)
        int[] hand2 = new int[5];
        int randomCard;
        System.out.println("Hand One:");
        for (int i = 0; i < 5; i++) //Logic/Output
        {
            randomCard = rand.nextInt(52); //Set randomCard
            while(deck[randomCard] == -999)
            {
                randomCard = rand.nextInt(52);
            }
            hand1[i] = deck[randomCard]; //Put randomCard in hand and print
            deck[randomCard] = -999;
            System.out.println(cardName(hand1[i]));
        }
        if (hasPair(hand1)) //Pair Check
        {
            System.out.println("Hand One has a pair.");
        }
        else
        {
            System.out.println("Hand One does not have a pair.");
        }
        System.out.println();
        System.out.println("Hand Two:"); //Repeat all for hand two
        for (int i = 0; i < 5; i++)
        {
            randomCard = rand.nextInt(52);
            while(deck[randomCard] == -999)
            {
                randomCard = rand.nextInt(52);
            }
            hand2[i] = deck[randomCard];
            deck[randomCard] = -999;
            System.out.println(cardName(hand2[i]));
        }
        if (hasPair(hand2))
        {
            System.out.println("Hand Two has a pair.");
        }
        else
        {
            System.out.println("Hand Two does not have a pair.");
        }
        
        
    }
    
    public static int getSmallest(int[] numbers) //Question 2
    {
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] < smallest)
            {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    
    public static int getLargest(int[] numbers)
    {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > largest)
            {
                largest = numbers[i];
            }
        }
        return largest;  
    }
    public static double getAverage(int[] numbers)
    {
        int sum = 0;
        double average;
        for (int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }
        average = sum/(double)numbers.length;
        return average;
    }
    public static int[] deckSwap(Random rand, int[] deck) //Question 4
    {
        int random = rand.nextInt(52);
        int placeholder = deck[random];
;
        if (random == 51)
        {
            deck[51] = deck[0];
            deck[0] = placeholder;
        }
        else
        {
            deck[random] = deck[random+1];
            deck[random+1] = placeholder;
        }
        return deck;
    }
    
    public static void printDeck(int[] deck)
    {
        for (int i = 0; i < deck.length; i++)
        {
            System.out.println(cardName(deck[i]));
        }
    }
    
    public static String cardName(int deck)//Questions 3-5
    {
        int card = deck % 13;
        int suit = (deck - card) / 13;
        return cardName(suit, card);
    }
    
    public static String cardName(int suit, int card)
    {
        String name = "";
        switch (card)
            {
            case 0:
                name = name + "Ace of ";
                break;
            case 1:
                name = name + "2 of ";
                break;
            case 2:
                name = name + "3 of ";
                break;
            case 3:
                name = name + "4 of ";
                break;
            case 4:
                name = name + "5 of ";
                break;
            case 5:
                name = name + "6 of ";
                break;
            case 6:
                name = name + "7 of ";
                break;
            case 7:
                name = name + "8 of ";
                break;
            case 8:
                name = name + "9 of ";
                break;
            case 9:
                name = name + "10 of ";
                break;
            case 10:
                name = name + "Jack of ";
                break;
            case 11:
                name = name + "Queen of ";
                break;
            case 12:
                name = name + "King of ";
                break;
            }
        switch (suit)
        {
            case 0:
                name = name + "Clubs";
                break;
            case 1:
                name = name + "Diamonds";
                break;
            case 2:
                name = name + "Hearts";
                break;
            case 3:
                name = name + "Spades";
                break;
        }
        return name;
    }
    public static boolean hasPair(int[] hand) //Question 5
    {
        for (int i = 0; i < hand.length - 1; i++)
        {
            for (int j = i+1; j < hand.length; j++)
            {
                if (hand[i]%13 == hand[j]%13)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
}
