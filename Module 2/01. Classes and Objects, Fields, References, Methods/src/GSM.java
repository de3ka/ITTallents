
public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallsDuration;
	double lastIncomingCall;
	double lastOutcomingCall;

	void insertSimCard(String simMobile) {
		if (simMobile.length() == 10 && simMobile.charAt(0) == 48 && simMobile.charAt(1) == 56
				&& simMobile.matches("[0-9]+")) {
			simMobileNumber = simMobile;
			hasSimCard = true;
		}
	}

	void removeSimCard() {
		simMobileNumber = "";
		hasSimCard = false;
	}

	double call(String receiver, double duration, boolean receiverSimCard) {
		if (duration > 0 && !(this.simMobileNumber.equals(receiver))  && receiverSimCard && this.hasSimCard) {
			double IncomingCall = duration;

			this.lastOutcomingCall = duration;
			this.outgoingCallsDuration = this.outgoingCallsDuration + duration;
			return IncomingCall;
		}
		return 0;
	}

	double getSumForCall() {
		double result = outgoingCallsDuration * Call.priceForAMinute;
		return result;
	}
	String hoursToMinutes(double duration) {
		int hours = 0;
		int minutes = 0;
		if (duration > 60) {
			minutes = (int) (duration % 60);
			hours = (int) (duration / 60);
		}
		return hours + "h." + minutes + "min.";
	}

	void printInfoForTheLastOutgoingCall(){
		System.out.println("LastOutcoming Call is "+hoursToMinutes(lastOutcomingCall));
	}
	void printInfoForTheLastIncomingCall(){
		System.out.println("LastIncoming Call is "+hoursToMinutes(lastIncomingCall));
	}
}
