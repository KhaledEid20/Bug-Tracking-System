/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bugtestingsystem;


/**
 *
 * @author pc
 */
import java.util.*;
import java.lang.*;
public class BugTestingSystem {

       public static void main(String[] args) 
       {
                    char c;
                    int m;
                    boolean flag=true;
                    Scanner input = new Scanner(System.in);
                    String adminname="";
                    String developername="";
                    String projectManagerName="";
                    while(flag)
                    {
                           try 
                           {
                                    System.out.print("Enter any character to start and 'e' or 'E' to exit:");
                                    c=input.next().charAt(0);
                                    if(c=='e'||c=='E')
                                    {
                                             flag=false;
                                    }
                                    else
                                    {
                                            System.out.println("login as ?");
                                            System.out.println("1) admin");
                                            System.out.println("2) tester ");
                                            System.out.println("3) project manager");
                                            System.out.println("4) developer ");
                                            m=input.nextInt();
                                            switch (m) 
                                            {
                                                     case 1:
                                                              String namew;
                                                              boolean logOut=true;
                                                              namew = input.nextLine();
                                                              String name;
                                                              System.out.println("enter ur name ");
                                                              name = input.nextLine();
                                                              String pass;
                                                              System.out.println("enter ur password ");
                                                              pass = input.nextLine();
                                                              Admin a= new Admin(name,pass);
                                                              if (a.Login()==true)
                                                              {
                                                                        adminname=name;
                                                                        System.out.println("hello Mr "+adminname);
                                                                        while(logOut)
                                                                        {
                                                                                int r;
                                                                                System.out.println("what do u want ?");
                                                                                System.out.println("1) add");
                                                                                System.out.println("2) update ");
                                                                                System.out.println("3) delete");
                                                                                System.out.println("4) view all bugs");
                                                                                System.out.println("5)logout");
                                                                                r=input.nextInt();
                                                                                switch (r)
                                                                                {
                                                                                        case 1:
                                                                                                String namea;
                                                                                                namea = input.nextLine();
                                                                                                String newname;
                                                                                                System.out.println("enter the new name ");
                                                                                                newname = input.nextLine();
                                                                                                String newpass;
                                                                                                System.out.println("enter the new password ");
                                                                                                newpass = input.nextLine();
                                                                                                String type;
                                                                                                System.out.println("enter the type of user");
                                                                                                System.out.println("b) tester ");
                                                                                                System.out.println("c) project manager");
                                                                                                System.out.println("d) developer ");
                                                                                                type = input.nextLine();
                                                                                                switch (type) 
                                                                                                {
                                                                                                         case "b":
                                                                                                                  FilePath fpt = new FilePath();
                                                                                                                  if(a.add(fpt.tester, newname, newpass)== true)
                                                                                                                  {
                                                                                                                           System.out.println("new tester added by admin Mr "+adminname+" successfully");
                                                                                                                  }
                                                                                                                  else
                                                                                                                  {
                                                                                                                           System.out.println("error");
                                                                                                                  }
                                                                                                                   break;
                                                                                                         case "c":
                                                                                                                  FilePath fppm = new FilePath();
                                                                                                                  if(a.add(fppm.projectManager, newname, newpass)== true)
                                                                                                                  {
                                                                                                                           System.out.println("new project Manager added by admin Mr "+adminname+" successfully");
                                                                                                                  }
                                                                                                                  else
                                                                                                                  {
                                                                                                                           System.out.println("error");
                                                                                                                  }
                                                                                                                  break;
                                                                                                         case "d":
                                                                                                                  FilePath fpd = new FilePath();
                                                                                                                  if(a.add("Developer", newname, newpass)== true)
                                                                                                                  {
                                                                                                                           System.out.println("new developer added by admin Mr "+adminname+" successfully");
                                                                                                                  }
                                                                                                                  else
                                                                                                                  {
                                                                                                                           System.out.println("the user name already exists");
                                                                                                                  }
                                                                                                                  break;


                                                                                                          default:
                                                                                                                  System.out.println("Sorry! Wrong input try again");
                                                                                                                   break;
                                                                                                }
                                                                                                break;
                                                                                        case 2:
                                                                                                    int u;
                                                                                                    System.out.println("update which one ?");
                                                                                                    System.out.println("1) admin ");
                                                                                                    System.out.println("2) tester ");
                                                                                                    System.out.println("3) project manager");
                                                                                                    System.out.println("4) developer");
                                                                                                    u=input.nextInt();
                                                                                                    switch (u)
                                                                                                    {
                                                                                                        case 1:
                                                                                                            String named;
                                                                                                            //System.out.println("");
                                                                                                            named = input.nextLine();
                                                                                                            String oldnamea;
                                                                                                            System.out.println("enter the old name ");
                                                                                                            oldnamea = input.nextLine();
                                                                                                            String oldpassa;
                                                                                                            System.out.println("enter the old password ");
                                                                                                            oldpassa = input.nextLine();
                                                                                                            String newnp;
                                                                                                            System.out.println("update password or name? ");
                                                                                                            newnp = input.nextLine();
                                                                                                            String newdata;
                                                                                                            System.out.println("Enter the new"+newnp+":");
                                                                                                            newdata = input.nextLine();
                                                                                                            FilePath fpua = new FilePath();
                                                                    //                                                     String type, String name,String pass, String new_value,String name_or_pass
                                                                                                            if(a.update(fpua.admin, oldnamea, oldpassa, newdata, newnp)==true)
                                                                                                            {
                                                                                                                System.out.println("admin updated by admin Mr "+adminname+" successfully");
                                                                                                            }
                                                                                                            else
                                                                                                            {
                                                                                                                System.out.println("you entered wrong admin data ");
                                                                                                            }
                                                                                                          break;


                                                                                                      case 2:
                                                                                                                System.out.println("tester");
                                                                                                                String nam;
                                                                                                                nam = input.nextLine();
                                                                                                                String oldnamet;
                                                                                                                System.out.println("enter the old name ");
                                                                                                                oldnamet = input.nextLine();
                                                                                                                String oldpasst;
                                                                                                                System.out.println("enter the old password ");
                                                                                                                oldpasst = input.nextLine();
                                                                                                                String newnpt;
                                                                                                                System.out.println("update password or name? ");
                                                                                                                newnpt = input.nextLine();
                                                                                                                String newdatat;
                                                                                                                System.out.println("Enter the new"+newnpt+":");
                                                                                                                newdatat = input.nextLine();
                                                                                                                FilePath fput = new FilePath();
                                                                                                                if(a.update(fput.tester, oldnamet, oldpasst, newdatat, newnpt)==true)
                                                                                                                {
                                                                                                                      System.out.println("tester updated by admin Mr "+adminname+" successfully");
                                                                                                                }
                                                                                                                else
                                                                                                                {
                                                                                                                      System.out.println("you entered wrong tester data ");
                                                                                                                }
                                                                                                                break;

                                                                                                      case 3:
                                                                                                                System.out.println("project manager");
                                                                                                                String na;
                                                                                                                na = input.nextLine();
                                                                                                                String oldnamepm;
                                                                                                                System.out.println("enter the old name ");
                                                                                                                oldnamepm = input.nextLine();
                                                                                                                String oldpasspm;
                                                                                                                System.out.println("enter the old password ");
                                                                                                                oldpasspm = input.nextLine();
                                                                                                                String newnppm;
                                                                                                                System.out.println("update password or name? ");
                                                                                                                newnppm = input.nextLine();
                                                                                                                String newdatapm;
                                                                                                                System.out.println("Enter the new "+newnppm+" :");
                                                                                                                newdatapm = input.nextLine();
                                                                                                                FilePath fpupm = new FilePath();
                                                                                                                if(a.update(fpupm.projectManager, oldnamepm, oldpasspm, newdatapm, newnppm)==true)
                                                                                                                {
                                                                                                                          System.out.println("Project Manager updated by admin Mr "+adminname+" successfully");
                                                                                                                }
                                                                                                                else
                                                                                                                {
                                                                                                                           System.out.println("you entered wrong Project Manager data ");
                                                                                                                }
                                                                                                                 break;

                                                                                                        case 4:
                                                                                                            System.out.println("developer");
                                                                                                            String n;
                                                                                                            n = input.nextLine();
                                                                                                            String oldnamed;
                                                                                                            System.out.println("enter the name ");
                                                                                                            oldnamed = input.nextLine();
                                                                                                            String oldpassd;
                                                                                                            System.out.println("enter the old password ");
                                                                                                            oldpassd = input.nextLine();
                                                                                                            String newnpd;
                                                                                                            newnpd ="password";
                                                                                                            String newdatad;
                                                                                                            System.out.println("Enter the new "+newnpd+" :");
                                                                                                            newdatad = input.nextLine();
                                                                                                            if(a.update("Developer", oldnamed, oldpassd, newdatad, newnpd)==true)
                                                                                                            {
                                                                                                                  System.out.println("Developer updated by admin Mr "+adminname+" successfully");
                                                                                                            }
                                                                                                            else
                                                                                                            {
                                                                                                                  System.out.println("you entered wrong Developer data ");
                                                                                                            }
                                                                                                           break;  
                                                                                                        default:
                                                                                                            System.out.println("Sorry! Wrong input try again");
                                                                                                             break;
                                                                                                    }
                                                                                                  break;

                                                                                        case 3:
                                                                                                    System.out.println("delete");
                                                                                                    String n;
                                                                                                    n = input.nextLine();
                                                                                                    String deletename;
                                                                                                    System.out.println("enter the name ");
                                                                                                    deletename = input.nextLine();
                                                                                                    String deletepass;
                                                                                                    System.out.println("enter the password ");
                                                                                                    deletepass = input.nextLine();
                                                                                                    String t;
                                                                                                    System.out.println("enter the type of user u want to delete ");
                                                                                                    System.out.println("a) admin ");
                                                                                                    System.out.println("b) tester ");
                                                                                                    System.out.println("c) project manager");
                                                                                                    System.out.println("d) developer ");
                                                                                                    t = input.nextLine();
                                                                                                    switch (t) 
                                                                                                    {
                                                                                                         case "a":
                                                                                                            FilePath fpa = new FilePath();
                                                                                                            if(a.delete(fpa.admin, deletename, deletepass)== true)
                                                                                                            {
                                                                                                                   System.out.println("An admin deleted by admin Mr "+adminname+" successfully");
                                                                                                            }
                                                                                                            else
                                                                                                            {
                                                                                                                   System.out.println("error");
                                                                                                            }
                                                                                                          break;

                                                                                                         case "b":
                                                                                                            if(a.delete("Tester", deletename, deletepass)== true)
                                                                                                            {
                                                                                                                   System.out.println("tester deleted by admin Mr "+adminname+" successfully");
                                                                                                            }
                                                                                                            else
                                                                                                            {
                                                                                                                  System.out.println("error");
                                                                                                            }
                                                                                                          break;

                                                                                                         case "c":
                                                                                                            if(a.delete("ProjectManager", deletename, deletepass)== true)
                                                                                                            {
                                                                                                                    System.out.println("project Manager deleted by admin Mr "+adminname+" successfully");
                                                                                                            }
                                                                                                            else
                                                                                                            {
                                                                                                                    System.out.println("error");
                                                                                                            }
                                                                                                          break;

                                                                                                        case "d":
                                                                                                            FilePath fpd = new FilePath();
                                                                                                            if(a.delete("Developer", deletename, deletepass)== true)
                                                                                                            {
                                                                                                                   System.out.println("developer deleted by admin Mr "+adminname+" successfully");
                                                                                                            }
                                                                                                            else
                                                                                                            {
                                                                                                                   System.out.println("error");
                                                                                                            }
                                                                                                          break;

                                                                                                        default:
                                                                                                            System.out.println("Sorry! Wrong input try again");
                                                                                                            break;
                                                                                                    }
                                                                                                 break;

                                                                                        case 4:
                                                                                                  String View=a.view_all_bugs();
                                                                                                  System.out.println("bugs in the system : \n"+View);
                                                                                                  break; 

                                                                                        case 5:
                                                                                                  logOut=false;
                                                                                                  break;

                                                                                        default:
                                                                                                 System.out.println("Sorry! Wrong input try again");
                                                                                                  break;
                                               }

                                                                    }
                                                            }
                                                            else
                                                            {
                                                                System.out.println("incorrect password or username ");
                                                            }
                                                          break;


                                                       case 2:
                                                                System.out.println("login tester");
                                                                String namet;
                                                                namet = input.nextLine();
                                                                String namek;
                                                                System.out.println("enter ur name ");
                                                                namek = input.nextLine();
                                                                String passt;
                                                                System.out.println("enter ur password ");
                                                                passt = input.nextLine();
                                                                Tester t= new Tester(namek,passt);
                                                                boolean logOut_t=true;
                                                                if(t.Login() == true)
                                                                {
                                                                    System.out.println("Hello Mr : " + namek);
                                                                    while(logOut_t){
                                                                    System.out.println("1) Add Bug") ;
                                                                    System.out.println("2) Assign to Devoloper") ;
                                                                    System.out.println("3) monitor The Bugs") ;
                                                                    System.out.println("4)Logout") ;
                                                                    int x;
                                                                    Scanner i = new Scanner(System.in);
                                                                    x = i.nextInt();
                                                                   switch(x){
                                                                       case 1:
                                                                           Scanner in = new Scanner(System.in);
                                                                           System.out.print("Enter Bug Name :");
                                                                           String bName = in.nextLine();

                                                                           System.out.print("Enter The Type Of Bug :");
                                                                           String type =in.nextLine();

                                                                           System.out.print("Enter The Project Name :");
                                                                           String ProjName=in.nextLine();

                                                                           System.out.print("Enter The Bug Date :");
                                                                           String bugDate=in.nextLine();

                                                                           System.out.print("Enter The Priority :");
                                                                           int priority = in.nextInt();

                                                                           System.out.print("Enter The Bug Level :");
                                                                           int bugLevel = in.nextInt();

                                                                           System.out.print("Enter The Status of The Bug :");
                                                                           boolean Status=in.nextBoolean();

                                                                           if(t.addBug(bName , type , priority ,bugLevel , ProjName , bugDate , Status))
                                                                           {
                                                                               System.out.println("Bug added successfully!");
                                                                           }
                                                                           else  System.out.println("Wrong input!");
                                                                           break;
                                                                    case 2:
                                                                        Scanner inp = new Scanner(System.in);
                                                                        System.out.print("Enter The Devoloper Name : ");
                                                                        String devName = inp.nextLine();

                                                                        System.out.print("Enter Bug name : ");
                                                                        String bugName = inp .nextLine();

                                                                        if(t.assignBug(devName , bugName))
                                                                        {
                                                                            System.out.println("Bug Assigned successfully !");
                                                                        }
                                                                        else
                                                                        {
                                                                            System.out.println("Wrong input!");
                                                                        }
                                                                        break;

                                                                       case 3:
                                                                           System.out.println("Enter Bug name :");
                                                                           Scanner inpu = new Scanner(System.in);
                                                                           String BugName = inpu.nextLine();

                                                                           String s = t.viewStatus(BugName);
                                                                           if("true".equals(s)){
                                                                               System.out.println("The Bug Is closed");
                                                                           }
                                                                           else if ("false".equals(s)){
                                                                               System.out.println("The Bug Is open");

                                                                           }
                                                                           break;

                                                                       case 4:
                                                                           logOut_t=false;
                                                                           break;

                                                                       default:
                                                                            System.out.println("Sorry! Wrong input try again");
                                                                           break;
                                                                   }
                                                                }
                                                                }
                                                                else
                                                                {
                                                                    System.out.println("you entered wrong pass or user name");
                                                                }
                                                                break;



                                                        case 3:
                                                            System.out.println("login project manager");
                                                            String pmname;
                                                            System.out.println("enter ur name ");
                                                            String v=input.nextLine();
                                                            pmname = input.nextLine();
                                                            String pmpass;
                                                            System.out.println("enter ur password ");
                                                            pmpass = input.nextLine();
                                                            ProjectManager pm = new ProjectManager(pmname,pmpass);
                                                            if(pm.Login()==true)
                                                            {
                                                                projectManagerName=pmname;
                                                                System.out.println("hello Mr "+projectManagerName);
                                                                int s;
                                                                boolean logOut_p=true;
                                                                while(logOut_p){
                                                                System.out.println("what do u want ?");
                                                                System.out.println("1) check performance of developers");
                                                                System.out.println("2) check performance of testers ");
                                                                System.out.println("3) view open bugs");
                                                                System.out.println("4) view closed bugs");
                                                                System.out.println("5)logout");
                                                                s=input.nextInt();

                                                                switch (s)
                                                                {
                                                                    case 1 :
                                                                        String nam;
                                                                        nam = input.nextLine();
                                                                        String nameed;
                                                                        System.out.println("Enter developer name");
                                                                        nameed = input.nextLine();
                                                                        System.out.println(pm.trackDev(nameed));
                                                                        break;
                                                                    case 2 :
                                                                        String nameeeeeeee;
                                                                        nameeeeeeee = input.nextLine();
                                                                        String namee;
                                                                        System.out.println("Enter tester name"); 
                                                                        namee = input.nextLine();
                                                                        System.out.println(pm.trackTester(namee));
                                                                        break;
                                                                        
                                                                    case 3 : 
                                                                         System.out.println(pm.viewOpenBugs());
                                                                         break;

                                                                    case 4 : 
                                                                         System.out.println(pm.viewClosedBugs());
                                                                         break;
                                                                         
                                                                    case 5:
                                                                        logOut_p=false;
                                                                        break;
                                                                        
                                                                    default : 
                                                                         System.out.println("Sorry! Wrong input try again");
                                                                         break; 
                                                                }
                                                            }  
                                                            }
                                                            else
                                                            {
                                                                System.out.println("you entered wrong pass or user name");
                                                            }

                                                            break;

                                                       case 4:
                                                            System.out.println("login developer");
                                                            String x;
                                                            x = input.nextLine();
                                                            String dname;
                                                            System.out.println("enter ur name ");
                                                            dname = input.nextLine();
                                                            String dpass;
                                                            System.out.println("enter ur password ");
                                                            dpass = input.nextLine();
                                                            Developer d = new Developer(dname,dpass);
                                                            if(d.Login()==true)
                                                            {
                                                                developername=dname;
                                                                String ds="";
                                                                boolean logOut_d=true;
                                                                while(logOut_d){
                                                                System.out.println("what do u want ?");
                                                                System.out.println("a) view assigned bugs ");
                                                                System.out.println("b) change status of bug ");
                                                                System.out.println("q) logout ");
                                                                ds = input.nextLine();
                                                                switch (ds) 
                                                                {
                                                                    case "a":
                                                                        System.out.println(d.viewAssignedBugs(developername));
                                                                        break;
                                                                    case "b":                               
                                                                        String bugname;
                                                                        System.out.println("enter bug name ");
                                                                        bugname = input.nextLine();
                                                                        String statusd;
                                                                        System.out.println("enter status of the bug");
                                                                        statusd = input.nextLine();
                                                                        if(d.changeBugStatus(bugname,statusd,developername))
                                                                        {
                                                                            System.out.println("status of bug changed");
                                                                            System.out.println("check your mail box");
                                                                        }
                                                                        else
                                                                        {
                                                                            System.out.println("you entered wrong bug data");
                                                                        }
                                                                      break;
                                                                      
                                                                    case "q":
                                                                        logOut_d=false;
                                                                        break;

                                                                    default:
                                                                        System.out.println("Sorry! Wrong input try again");
                                                                      break;
                                                                      }
                                                                 }
                                                            }
                                                            else
                                                            {
                                                                System.out.println("you entered wrong pass or user name");
                                                            }
                                                          break;
                                                          
                                                        default:
                                                              System.out.println("Sorry! Wrong input try again");
                                                               break;
                                            }
                                    }
                            }
                            catch (Exception e)
                               {
                                    System.out.println("Sorry Wrong Input !");
                               }
                       }
   
          }      
}