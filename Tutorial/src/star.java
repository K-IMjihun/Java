
		public class star {

			public static void main(String[] args) {

				for(int i = 0; i < 30; i++)
				{
					if(0 <= i && i < 10)
					{
						for(int a = 0; a < 20; a++)
							{
							System.out.print(" ");
							}
							for (int b = 0; b < 10 - i; b++)
							{
								System.out.print(" ");
							}
						for (int c = 0; c < 2*i+1; c++)
						{
							System.out.print("*");
						}
					}
					if( 9 < i && i < 20)
					{
						for(int d = 0; d < 10; d++);
						{
							for(int e = 0; e < i-10; e++)
							{
								System.out.print(" ");
							}
							{
								for(int f = 0; f < 80-i*2; f++)
								{
										System.out.print("*");	
								}
							}
						}
					}
					if(19 < i)
					{
						for(int a = 0; a < 29-i; a++)
						{
								System.out.print(" ");
						}
						for(int b = 0; b < 60-i*2; b++)
						{
							System.out.print("*");
						}
						for(int c = 120; c < i*6; c++)
						{
							System.out.print(" ");
						}
						for(int d = 0; d < 62-i*2; d++)
						{
							System.out.print("*");
						}
						}
					System.out.println();
					}
				}


		}