package Enum_;

	
	interface d{
		public String getDescription();
		public int getI();

		public enum AnyEnum_ implements d{
			
			Constants_A{
				public String getDescription() {
					return ("����ö�ٳ�ԱA");
				}
				public int getI() {
					return i;
				}
			},
			
			Constants_B{
				public String getDescription() {
					return ("����ö�ٳ�ԱB");
				}
				public int getI() {
					return i;
					}
			},
			
			Constants_C{
				public String getDescription() {
					return ("����ö�ٳ�ԱC");
				}
				public int getI() {
					return i;
				}
			},
			
			Constants_D(){
				public String getDescription() {
					return ("����ö�ٳ�ԱD");
				}
				public int getI() {
					return i;
				}
			};
			
			private static int i = 5;
			
	public static void main(String[] args) {
		
		for(int i = 0;i < AnyEnum_.values().length;i++) {
			System.out.println(AnyEnum_.values()[i]+"����getDescription()����Ϊ��"
					+AnyEnum_.values()[i].getDescription());
			System.out.println(AnyEnum_.values()[i]+"����getI()����Ϊ��"
					+AnyEnum_.values()[i].getI());
		}
	}

	}
	}
