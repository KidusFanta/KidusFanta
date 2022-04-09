package test;


public class Time {


	private int hours;



	private int minutes;


	private boolean afternoon;



	public Time(String militaryTime) {


	if (militaryTime == null){

		System.out.println(

				"You must enter a valid miliary time." );

	}



	else if (militaryTime.length()!=5)

		{

		System.out.println(militaryTime +

				" is not a valid miliary time." );

		}

	else

	{



		if (militaryTime.charAt(2)!=':'){

			System.out.println(militaryTime +

					" is not a valid miliary time." );

		}



		else if (!Character.isDigit(militaryTime.charAt(0))){

			System.out.println(militaryTime +

					" is not a valid miliary time." );

		}

		else if (!Character.isDigit(militaryTime.charAt(1)))

		{

			System.out.println(militaryTime +

					" is not a valid miliary time." );

		}

		else if (!Character.isDigit(militaryTime.charAt(3))){

			System.out.println(militaryTime +

					" is not a valid miliary time." );

		}

		else if (!Character.isDigit(militaryTime.charAt(4)))

		{

			System.out.println(militaryTime +

					" is not a valid miliary time." );

		}

			else

			{


				hours=Integer.parseInt( militaryTime.substring(0,2));



				minutes=Integer.parseInt(militaryTime.substring(3,5));



				if(hours > 23){

					System.out.println(militaryTime +

								" is not a valid miliary time." );

				}

				else if(minutes > 59){

					System.out.println(militaryTime +

							" is not a valid miliary time." );

				}



				else if (hours > 12){

					hours = hours - 12;

					afternoon = true;

					System.out.println(this.toString());

				}


				else if (hours == 0){

					hours = 12;

					System.out.println(this.toString());

				}



				else if (hours == 12){

					afternoon = true;

					System.out.println(this.toString());

				}



				else

				{

					System.out.println(this.toString());

				}

			}

	}

	}



	public String toString()

	{

		String am_pm;

		String zero = "";

		if (afternoon)

			am_pm = "PM";

		else {

			am_pm = "AM";
			}

		if (minutes < 10)

			zero = "0";

		return hours + ":" + zero + minutes + " " + am_pm;

	}

}