package Enum_;

	
	interface d{
		public String getDescription();
		public int getI();

		public enum AnyEnum_ implements d{
			
			Constants_A{
				public String getDescription() {
					return ("我是枚举成员A");
				}
				public int getI() {
					return i;
				}
			},
			
			Constants_B{
				public String getDescription() {
					return ("我是枚举成员B");
				}
				public int getI() {
					return i;
					}
			},
			
			Constants_C{
				public String getDescription() {
					return ("我是枚举成员C");
				}
				public int getI() {
					return i;
				}
			},
			
			Constants_D(){
				public String getDescription() {
					return ("我是枚举成员D");
				}
				public int getI() {
					return i;
				}
			};
			
			private static int i = 5;
			
	public static void main(String[] args) {
		
		for(int i = 0;i < AnyEnum_.values().length;i++) {
			System.out.println(AnyEnum_.values()[i]+"调用getDescription()方法为："
					+AnyEnum_.values()[i].getDescription());
			System.out.println(AnyEnum_.values()[i]+"调用getI()方法为："
					+AnyEnum_.values()[i].getI());
		}
	}

	}
	}
