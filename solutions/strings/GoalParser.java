package solutions.strings;

// https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParser {
  public String interpret(String command) {    
    return command.replace("()", "o").replace("(al)", "al");
  }
}
