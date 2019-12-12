package CS5800A;

	public class BossCarFactory implements ICarFactory{

		@Override
		public Lights createLights() {
			return new HighBeam();
		}

		@Override
		public Tyres createTyres() {
			return new Radial();
		}

	}


