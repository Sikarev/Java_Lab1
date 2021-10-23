package com.company;

import list.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        LinkedList<Integer> obj = new LinkedList<Integer>();
        var a=1;
        while (a!=0) {
            var in = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);
            System.out.println("Input command:");
            System.out.println("1: pushBack");
            System.out.println("2: pushFront");
            System.out.println("3: popFront");
            System.out.println("4: popBack");
            System.out.println("5: insert");
            System.out.println("6: delete");
            System.out.println("7: get");
            System.out.println("8: print");
            System.out.println("0: exit");
            a = sc.nextInt();
            switch (a) {
                case 1: {
                    System.out.println("Input value");
                    var i = sc.nextInt();
                    obj.pushBack(i);
                    break;
                }
                case 2: {
                    System.out.println("Input value");
                    var i = sc.nextInt();
                    obj.pushFront(i);
                    break;
                }
                case 3: {
                    try {
                        obj.popBack();
                    }
                    catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 4: {
                    try {
                        obj.popBack();
                    }
                    catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 5: {
                    System.out.println("Input position");
                    var position = sc.nextInt();
                    System.out.println("Input value");
                    var value = sc.nextInt();
                    try {
                        obj.insertAt(position, value);
                    }
                    catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 6: {
                    System.out.println("Input position");
                    var position = sc.nextInt();
                    try {
                        obj.eraseAt(position);
                    }
                    catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                }
                case 7: {
                    System.out.println("Input position");
                    var position = sc.nextInt();
                    try {
                        System.out.println(obj.getAt(position));
                    }
                    catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 8: {
                    obj.printList();
                    break;
                }
                default: {

                }
            }

        }
    }
}
