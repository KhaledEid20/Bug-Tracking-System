package com.mycompany.bugtestingsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Developer extends Person 
{
    Developer(String name, String password)
    {
        setName(name);
        setPassword(password);
    }

    public boolean Login()
    {
        String name = getName();
        String pass = getPassword();
        String userPass;
        File file = new File(FilePath.developer+name +".txt");

        try 
        {
            if (file.exists()) 
            {
                Scanner fr = new Scanner(file);
                userPass = fr.nextLine();
                if (pass.equals(userPass)) 
                {
                            fr.close();
                            return true;
                }
            } 
            else return false;


        } 
        catch (FileNotFoundException e) 
        {
            throw new RuntimeException(e);
        }

        return false;
    }

    public boolean changeBugStatus(String bugName, String status, String devName) throws IOException 
    {
        FileHandler f = new FileHandler("bug.txt");
        File filemail=new File("Testers_mailbox.txt");
        FileWriter fw=new FileWriter (filemail,true);
        String all = f.read_file("bug.txt");
        String all1="";
        if (status.equals("true")||status.equals("True"))
        {
            all1 =all.replace(bugName + "\n" + status, bugName + "\n" + "false");
            fw.append("bug: "+bugName+" is now open\n");
            fw.close();
        }
            
        else  if (status.equals("false")||status.equals("false"))
        {
            all1 = all.replace(bugName + "\n" + status, bugName + "\n" + "true");
            fw.append("bug: "+bugName+" is now closed\n");
            fw.close();
        }
        if(all1.equals(all))return false;
        f.delete("bug.txt");
        f.create_file();
        f.write_file(all1);
        if (status.equals("false") || status.equals("False"))
        {
                    FileHandler f2 = new FileHandler(FilePath.developer+ devName+".txt");
                    String all2 = f2.read_file(FilePath.developer + devName+".txt");
                    Scanner scanner = new Scanner(all2);
                    String firstLine = scanner.nextLine();
                    int number = Integer.parseInt(scanner.nextLine());
                    String replace = firstLine + "\n" + (number);

                    all2 = all2.replaceFirst(replace, firstLine + "\n" + (number + 1));

                    scanner.close();
                    f2.delete("dev_" + devName+".txt");
                    f2.create_file();
                    all2 = all2.trim();
                    f2.write_file(all2);
                    return true;

        }
        return true;
    }


    public String viewAssignedBugs(String devName) 
    {
        File file = new File(FilePath.developer + devName+".txt");

        String all = "";
        try 
        {
                    Scanner fr = new Scanner(file);
                    fr.nextLine();
                    fr.nextLine();
                    while (fr.hasNextLine()) 
                    {
                            String name = fr.nextLine();
                            all += (name + "\n");
                    }
                    fr.close();
                    return all;

        } 
        catch (FileNotFoundException e) 
        {
                    throw new RuntimeException(e);
        }

    }
    
}
