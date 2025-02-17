import java.util.Scanner;

class Checksum {
  public static void main(String[] args) {
    Scanner inputStream = new Scanner(System.in); 
    System.out.println("Enter a matriculation number:");
    String matricNum = inputStream.nextLine().toUpperCase();
    String origCheckSum = matricNum.substring(matricNum.length()-1, matricNum.length());

    if(!isWithinCharLimit(matricNum)) {
      System.out.println("Invalid");
      inputStream.close();
      return;
    }

    int checksum = validationHandler(matricNum);

    if(isValidChecksum(origCheckSum, checksum)) System.out.println("Valid");
    else System.out.println("Not valid");

    inputStream.close();
  }

  private static int validationHandler(String input) {
    int digit1 = Integer.parseInt(input.substring(1, 2));
    int digit2 = Integer.parseInt(input.substring(2, 3));
    int digit3 = Integer.parseInt(input.substring(3, 4));
    int digit4 = Integer.parseInt(input.substring(4, 5));
    int digit5 = Integer.parseInt(input.substring(5, 6));

    int sum = digit1 * 6 + digit2 * 5 + digit3 * 4 + digit4 * 3 + digit5 * 2;
    return sum % 5;
  }

  private static boolean isWithinCharLimit(String input) {
    if(input.length() == 7) return true;
    else return false;
  }

  private static boolean isValidChecksum(String originalChecksum, int checksumVal) {
    String checksumComparator;
    switch(checksumVal) {
      case 0:
      checksumComparator = "O";
        break;
      case 1:
      checksumComparator = "P";
        break;
      case 2:
      checksumComparator = "Q";
        break;
      case 3:
      checksumComparator = "R";
        break;
      case 4:
      checksumComparator = "S";
        break;
      default:
        return false;
    }

    if(originalChecksum.equals(checksumComparator)) return true;
    else return false;
  }
}
