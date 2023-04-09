/**
    * A program to carry on conversations with a human user.
    * This version:
    *<ul><li>
    *   Uses advanced search for keywords 
    *</li><li>
    *   Will transform statements as well as react to keywords
    *</li></ul>
    * @author Laurie White
    * @version April 2012
    *
    */
   public class MagpiePersonal
   {
     
      //Gets a default greeting
      public String getGreeting()
      {
         return "Hello, my name is LeBot James and I'll be your digital basketball expert for today. What is your name?";
      }
 
      //Obtains user statement and gives appropriate response, with responses needing to be transformed utilizing an external method
      public String getResponse(String statement, String name)
      {
         //If user doesn't give a resposne
         String response = "";
         if (statement.length() == 0)
         {
            response = "Say something, please.";
         }
         
        //If user talks about their favorite team, using transformFavoriteTeamStatement method
        else if (statement.indexOf("favorite") >= 0 && (statement.indexOf("Lakers") >= 0
				|| statement.indexOf("Warriors") >= 0
				|| statement.indexOf("Celtics") >= 0
				|| statement.indexOf("Nets") >= 0
        || statement.indexOf("Raptors") >= 0
        || statement.indexOf("Suns") >= 0 
        || statement.indexOf("Knicks") >= 0 
        || statement.indexOf("Heat") >= 0 
        || statement.indexOf("Mavericks") >= 0 
        || statement.indexOf("Bucks") >= 0
        || statement.indexOf("Bulls") >= 0
        || statement.indexOf("Spurs") >= 0
        || statement.indexOf("Jazz") >= 0
        || statement.indexOf("76ers") >= 0
        || statement.indexOf("Clippers") >= 0
        || statement.indexOf("Kings") >= 0
        || statement.indexOf("Trailblazers") >= 0
        || statement.indexOf("Cavaliers") >= 0
        || statement.indexOf("Grizzlies") >= 0
        || statement.indexOf("Pelicans") >= 0
        || statement.indexOf("Rockets") >= 0
        || statement.indexOf("Pistons") >= 0
        || statement.indexOf("Hornets") >= 0
        || statement.indexOf("Hawks") >= 0
        || statement.indexOf("Thunder") >= 0
        || statement.indexOf("Nuggets") >= 0
        || statement.indexOf("Wizards") >= 0
        || statement.indexOf("Magic") >= 0
        || statement.indexOf("Pacers") >= 0))
         {
            response = transformFavoriteTeamStatement(statement);
         }
         
         //If user asks for the first and last team in each conference
         else if(statement.indexOf("first") >= 0 && statement.indexOf("Eastern Conference") >= 0)
         {
           response = "As of 11/22, Right now the Celtics are at the top of the Eastern Conference.";
         }  
         
         else if(statement.indexOf("first") >= 0 && statement.indexOf("Western Conference") >= 0)
         {
           response = "As of 11/22, the Jazz are at the top of the Eastern Conference.";
         }  

        else if(statement.indexOf("last") >= 0 && statement.indexOf("Eastern Conference") >= 0)
         {
           response = "As of 11/22, the Pistons are at the bottom of the Eastern Conference.";
         }

        else if(statement.indexOf("first") >= 0 && statement.indexOf("Western Conference") >= 0)
         {
           response = "As of 11/22, the Rockets are at the bottom of the Western Conference.";
         }
          
        //If user asks for a specific team's record
        else if (statement.indexOf("record") >= 0)
        {
          if (statement.indexOf("Lakers") >= 0)
          {
            response = "As of 11/22, the Lakers are 5-11 overall, 14th in the West, and 4-6 in their last 10 games.";
          }
            
          else if (statement.indexOf("Warriors") >= 0)
          {
            response = "As of 11/22, the Warriors are 8-10 overall, 11th in the West, and 5-5 in their last 10 games.";
          }
            
          else if (statement.indexOf("Celtics") >= 0)
          {
            response = "As of 11/22, the Celtics are 13-4 overall, 1st in the East, and 9-1 in their last 10 games.";
          }
            
          else if (statement.indexOf("Nets") >= 0)
          {
            response = "As of 11/22, the Nets are 8-10 overall, 10th in the East, and 6-4 in their last 10 games.";
          }
            
          else if (statement.indexOf("Raptors") >= 0)
          {
            response = "As of 11/22, the Raptors are 9-8 overall, 8th in the East, and 5-5 in their last 10 games.";
          }
            
          else if (statement.indexOf("Suns") >= 0)
          {
            response = "As of 11/22, the Suns are 11-6 overall, 1st in the West, and 5-5 in their last 10 games";
          }

          else if (statement.indexOf("Knicks") >= 0)
          {
            response = "As of 11/22, the Knicks are 9-9 overall, 8th in the East, and 5-5 in their last 10 games.";
          }

          else if (statement.indexOf("Heat") >= 0)
          {
            response = "As of 11/22, the Heat are 7-11 overall, 12th in the East, and 4-6 in their last 10 games";
          }

          else if (statement.indexOf("Mavericks") >= 0)
          {
            response = "As of 11/22, the Heat are 9-7 overall, 9th in the West, and 6-4 in their last 10 games";
          }

          else if (statement.indexOf("Bucks") >= 0)
          {
            response = "As of 11/22, the Bucks are 12-4 overall, 2nd in the East, and 6-4 in their last 10 games";
          }

          else if (statement.indexOf("Bulls") >= 0)
          {
            response = "As of 11/22, the Bulls are 7-10 overall, 11th in the East, and 4-6 in their last 10 games";
          }

          else if (statement.indexOf("Spurs") >= 0)
          {
            response = "As of 11/22, the Spurs are 6-12 overall, 13th in the West, and 1-9 in their last 10 games.";
          }

          else if (statement.indexOf("Jazz") >= 0)
          {
            response = "As of 11/22, the Jazz are 12-7 overall, 2nd in the West, and 6-4 in their last 10 games.";
          }

          else if (statement.indexOf("76ers") >= 0)
          {
            response = "As of 11/22, the 76ers are 9-8 overall, 7th in the East, and 6-4 in their last 10 games.";
          }

          else if (statement.indexOf("76ers") >= 0)
          {
            response = "As of 11/22, the 76ers are 9-8 overall, 7th in the East, and 6-4 in their last 10 games.";
          }

          else if (statement.indexOf("Clippers") >= 0)
          {
            response = "As of 11/22, the Clippers are 11-7 overall, 4th in the West, and 7-3 in their last 10 games.";
          }

          else if (statement.indexOf("Kings") >= 0)
          {
            response = "As of 11/22, the Kings are 10-6 overall, 3rd in the West, and 8-2 in their last 10 games.";
          }

          else if (statement.indexOf("Trailblazers") >= 0)
          {
            response = "As of 11/22, the Trailblazers are 10-7 overall, 7th in the West, and 5-5 in their last 10 games.";
          }

          else if (statement.indexOf("Cavaliers") >= 0)
          {
            response = "As of 11/22, the Cavaliers are 11-6 overall, 3rd in the East, and 5-5 in their last 10 games.";
          }

          else if (statement.indexOf("Grizzles") >= 0)
          {
            response = "As of 11/22, the Grizzles are 10-8 overall, 9th in the West, and 5-5 in their last 10 games.";
          }

          else if (statement.indexOf("Pelicans") >= 0)
          {
            response = "As of 11/22, the Pelicans are 10-7 overall, 5th in the West, and 6-4 in their last 10 games.";
          }

          else if (statement.indexOf("Rockets") >= 0)
          {
            response = "As of 11/22, the Rockets are 3-14 overall, 15th in the West, and 2-8 in their last 10 games.";
          }

          else if (statement.indexOf("Pistons") >= 0)
          {
            response = "As of 11/22, the Pistons are 4-15 overall, 15th in the East, and 2-8 in their last 10 games.";
          }

          else if (statement.indexOf("Hornets") >= 0)
          {
            response = "As of 11/22, the Hornets are 4-14 overall, 14th in the East, and 1-9 in their last 10 games.";
          }

          else if (statement.indexOf("Hawks") >= 0)
          {
            response = "As of 11/22, the Hawks are 10-7 overall, 6th in the East, and 6-4 in their last 10 games.";
          }

          else if (statement.indexOf("Thunder") >= 0)
          {
            response = "As of 11/22, the Thunder are 7-10 overall, 12th in the West, and 3-7 in their last 10 games.";
          }

          else if (statement.indexOf("Nuggets") >= 0)
          {
            response = "As of 11/22, the Nuggets are 10-7 overall, 7th in the West, and 6-4 in their last 10 games.";
          }

          else if (statement.indexOf("Wizards") >= 0)
          {
            response = "As of 11/22, the Wizards are 10-7 overall, 5th in the East, and 7-3 in their last 10 games.";
          }

          else if (statement.indexOf("Magic") >= 0)
          {
            response = "As of 11/22, the Magic are 5-13 overall, 13th in the East, and 4-6 in their last 10 games.";
          }

          else if (statement.indexOf("Pacers") >= 0)
          {
            response = "As of 11/22, the Pacer are 10-6 overall, 4th in the West, and 8-2 in their last 10 games.";
          }

        }
          
        //If a user asks for the leaders in certain statistical categories
        else if (statement.indexOf("leader") >= 0)
        {
          if (statement.indexOf("points") >= 0)
          {
            response = "As of 11/22, Luka Doncic of the Mavericks leads in points per game (33.5 ppg.";
          }
            
          else if (statement.indexOf("rebounds") >= 0)
          {
            response = "As of 11/22, Anthony Davis of the Lakers leads in rebounds per game (12.6 rpg).";
          }

          else if (statement.indexOf("assists") >= 0)
          {
            response = "As of 11/22, Tyrese Haliburton of the Pacers leads in assists per game (10.7 apg).";
          }

          else if (statement.indexOf("blocks") >= 0)
          {
            response = "As of 11/22, Brook Lopez of the Bucks leads in blocks per game (2.8 bpg).";
          }

          else if (statement.indexOf("steals") >= 0)
          {
            response = "As of 11/22, O.G. Anunoby of the Raptors leads in steals per game (2.5 spg).";
          }

          else if (statement.indexOf("field goal percentage") >= 0)
          {
            response = "As of 11/22, Nic Claxton of the Nets leads in field goal percentage (72.0 fg %).";
          }

          else if (statement.indexOf("three pointers made") >= 0)
          {
            response = "As of 11/22, Stephen Curry of the Warriors leads in three points made (84 3 Pts).";
          }

          else if (statement.indexOf("three point percentage") >= 0)
          {
            response = "As of 11/22, Yuta Watanabe of the Nets leads in three point percentage (57.1 3 pt %).";
          }
        }

        //If user asks for MVP or championship favorites
        else if (statement.indexOf("MVP") >= 0)
        {
          response = "My top three candidates for the 2022-23 MVP are Luka Doncic (DAL), Jayson Tatum (BOS), and Giannis Antetokounmpo (MIL).";
        }

        else if (statement.indexOf("championship") >= 0)
        {
          response = "My favorite for the 2023 NBA Champions are the Milwaukee Bucks, with the Finals MVP being Giannis Antetokounmpo.";
        }

        //If none of the above responses match the statement, give a random, noncommital response.
        else
        {
          response = getRandomResponse();
        }
        
        return response;
      }

      //Takes a statement with "My favorite team is the <team>" and transforms it into "You're favorite team is the <team> + "? Cool! I'm more of a Knicks fan myself" (if the <team> is the Knicks, it transforms the statement into "You're a Knicks fan? Me too!"

      private String transformFavoriteTeamStatement(String statement)
      {
         //Remove the final period, if there is one
         statement = statement.trim();
         String lastChar = statement.substring(statement
                                               .length() - 1);
         if (lastChar.equals("."))
         {
            statement = statement.substring(0, statement
                                               .length() - 1);
         }
         int psn = findKeyword (statement, "My favorite team is the", 0);
         String restOfStatement = statement.substring(psn + 24).trim();
        if(statement.indexOf("Knicks") >= 0){
          return "You're a Knicks fan? Me too!";
        }
        else
        {
          return "You're favorite team is the " + restOfStatement + "? Cool! I'm more of a Knicks fan myself";
        }

      }
 
      /**
       * Search for one word in phrase.  The search is not case sensitive.
       * This method will check that the given goal is not a substring of a longer string
       * (so, for example, "I know" does not contain "no").  
       * @param statement the string to search
       * @param goal the string to search for
       * @param startPos the character of the string to begin the search at
       * @return the index of the first occurrence of goal in statement or -1 if it's not found
       */ 
      private int findKeyword(String statement, String goal, int startPos)
      {
         String phrase = statement.trim();
         //  The only change to incorporate the startPos is in the line below
         int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
  
         //  Refinement--make sure the goal isn't part of a word 
         while (psn >= 0) 
         {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " "; 
            if (psn > 0)
            {
               before = phrase.substring (psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
               after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
            }
   
            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
            && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
               return psn;
            }
   
            //  The last position didn't work, so let's find the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
   
         }
  
         return -1;
      }

       /**
       * Search for one word in phrase.  The search is not case sensitive.
       * This method will check that the given goal is not a substring of a longer string
       * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
       * @param statement the string to search
       * @param goal the string to search for
       * @return the index of the first occurrence of goal in statement or -1 if it's not found
       */
      private int findKeyword(String statement, String goal)
      {
         return findKeyword (statement, goal, 0);
      }
      
      //Returns a random, noncommital response if none of the above responses mmatch the statement
      private String getRandomResponse()
      {
         final int NUMBER_OF_RESPONSES = 4;
         double r = Math.random();
         int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
         String response = "";
  
         if (whichResponse == 0)
         {
            response = "Interesting, tell me more.";
         }
         else if (whichResponse == 1)
         {
            response = "Hmmm.";
         }
         else if (whichResponse == 2)
         {
            response = "Do you really think so?";
         }
         else if (whichResponse == 3)
         {
            response = "You don't say.";
         }

         return response;
      }
   }