package solutions.strings;

// https://leetcode.com/problems/defanging-an-ip-address/
public class DefangledIP {
  public String defangIPaddr(String address) {
    return address.replace(".", "[.]");
  }
}
