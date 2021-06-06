/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.util.Scanner;
class CarIssue
{
    int failCase;
}
public class Exercise23
{
    public static void main(String[] args)
    {
        CarIssue ci = new CarIssue();
        ci = inputs(ci);
        String out = "";
        switch (ci.failCase) {
            case 1:
                out = "Clean terminals and try starting again.";
                break;
            case 2:
                out = "Replace cables and try again.";
                break;
            case 3:
                out = "Replace the battery.";
                break;
            case 4:
                out = "Check spark plug connections.";
                break;
            case 5:
                out = "Get it in for service.";
                break;
            case 6:
                out = "Check to ensure the choke is opening and closing";
                break;
            case 7:
                out = "This should not be possible";
                break;
            }
            System.out.println(out);
        }
        public static CarIssue inputs (CarIssue ci)
        {
            char input = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Is the car silent when you turn the key?");
            input = java.lang.Character.toLowerCase(sc.nextLine().charAt(0));
            if (input == 'y') {
                System.out.println("Are the battery terminals corroded?");
                input = sc.nextLine().charAt(0);
                if (input == 'y') {
                    ci.failCase = 1;
                } else {
                    ci.failCase = 2;
                }
            }
            else
            {
                System.out.println("Does the car make a slicking noise?");
                input = java.lang.Character.toLowerCase(sc.nextLine().charAt(0));
                if (input == 'y') {
                    ci.failCase = 3;
                }
                else
                {
                    System.out.println("Does the car crank up but fail to start?");
                    input = java.lang.Character.toLowerCase(sc.nextLine().charAt(0));
                    if (input == 'y')
                    {
                        System.out.println("Does the engine start and then die?");
                        input = java.lang.Character.toLowerCase(sc.nextLine().charAt(0));
                        if (input == 'y')
                        {
                            System.out.println("Does your car have fuel injection?");
                            input = java.lang.Character.toLowerCase(sc.nextLine().charAt(0));
                            if (input == 'y')
                            {
                                ci.failCase = 5;
                            }
                            else
                            {
                                ci.failCase = 6;
                            }
                        }
                        else
                        {
                            ci.failCase = 7;
                        }
                    }
                    else
                    {
                        ci.failCase = 4;
                    }
                }
            }
            return ci;
        }
    }
