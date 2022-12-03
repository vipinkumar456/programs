class Duplicate{
	public static void main(String args[])
	{
 String input = "programmingpsfr";

    String output = "";
    for (int index = 0; index < input.length(); index++) {
        if (input.charAt(index % input.length()) != input
                .charAt((index + 1) % input.length())) {

            output += input.charAt(index);

        }
    }
    System.out.println(output);
}}

// public class Duplicate {

    // public static void main(String[] args) {

        // String input ="programming";
        // String output ="";

        // for (int i = 0; i < input.length(); i++) {
            // for (int j = 0; j < output.length(); j++) {
                // if (input.charAt(i) != output.charAt(j)) {
                    // output = output + input.charAt(i);
                // }
            // }
        // }

        // System.out.println(output);

    // }

// }



// class Duplicate
// {
	// public static void main(String[] args)
	// {
		// String input=new String("programming");
		// String output=new String();
		// for(int i=0;i<input.length();i++)
		// {
			// for(int j=0;j<output.length();j++)
			// {
			// if(input.charAt(i)!=output.charAt(j))
			// {
				// output=output+input.charAt(i);
			// }
			// }
		// }
		// System.out.println(output);
	// }
// }