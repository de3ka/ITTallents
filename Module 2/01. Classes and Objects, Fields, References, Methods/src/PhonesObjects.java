/*������ 2:
�� �� �������� ��������� Call � GSM, ����������� ���������
��������� �������� � �������.
������ Call �� ������� �������� ������:
priceForAMinute � �������� ����, ����� ������� ������ �� �������� ��
������
caller - ������� ��������, �� ����� � ��������� �����������
receiver - ������� ��������, ��� ����� � ��������� �����������
duration - ��������� �� ��������� (� ������)
������ GSM �� ������� ��������:
model � ����� �� ��������
hasSimCard � ���� � �������� � �������� SIM �����
simMobileNumber � ����� �� SIM �������(��������� �����), ��� �
�������� ������.
outgoingCallsDuration � ������ ����� (� ������) �� ����������
����������
lastIncomingCall � ���������� ������� ���������
lastOutgoingCall � ���������� �������� ���������
�� �� ������� �������� ������ �� ����� GSM:
- insertSimCard(simMobileNumber) � ������ ������ �����(��� �����)
�� ��������. �� �� ������� ���� ���������� ����� � �������
(������� � 08 � �� ������ �� 10 �����). ��� ������� � �������, ��
������ �� �������� � ������ �������� true �� ������ hasSimCard
- removeSimCard() - �������� ��� ������� �� �������� (������ false
�� ������ hasSimCard)
- call( receiver, duration) � � ������ �� �� �� �������� �������� ��:
� ���� ���������� ������� �� ��������� � �������
� ���� ����� �������� (���� �� ����� �� ������� ������ �
���� ��� ����� �� ����� ����������) �� �� ���� � ��� �������
� ���� � ����� �������� ���� ��� �����
��� ������ �������� �������� �������, ������ ����� �������� �
��������������� duration ��� ��������, ������� ���� ���������.
������ ���� �������� ���� �������� �������� ��������� ��
�������� �� ����� �� ����� ����������� (�������� �� ����� ��
������� ������) � ������ ������ �������� ���� �������� ������� ��
�������� ��� ����� �� ����� ����������.
���� ���� ��������� ���������� �� outgoingCallsDuration ���
��������� �� ��������� �� �������� �� ����� �� ����� ����������.
�� �� ������� � ����� getSumForCall(), ����� ����� ������,
��������� �� ���������� ���������� �� �������� (������ ����� ��
���������� ���������� �� ������ �� ������ - priceForAMinute).
�� �� �������� ��� ������
printInfoForTheLastOutgoingCall() �
printInfoForTheLastIncomingCall()
����� �������� ���������� �� ���������� ��������/�������
��������� �� �������� (��� ��� ������)
 */
import java.util.Scanner;

public class PhonesObjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GSM firstPhone = new GSM();
		GSM secondPhone = new GSM();
		System.out.println("Please enter first phone's model:");
		firstPhone.model = sc.nextLine();
		System.out.println("Please enter second phone's number:");
		secondPhone.model = sc.nextLine();
		firstPhone.simMobileNumber = "";
		secondPhone.simMobileNumber = "";

		System.out.println("Please enter the phone number of first phone:");
		String newNumber = sc.nextLine();
		firstPhone.insertSimCard(newNumber);
		System.out.println("Please enter the phone number of second phone:");
		newNumber = sc.nextLine();
		System.out.println("Please enter the duration of the call:");
		int callDuration = sc.nextInt();
		secondPhone.insertSimCard(newNumber);
		
		System.out.println(firstPhone.model + " number is - " + firstPhone.simMobileNumber);
		System.out.println(firstPhone.model + " has sim card - " + firstPhone.hasSimCard);
		System.out.println(secondPhone.model + " number is - " + secondPhone.simMobileNumber);
		System.out.println(secondPhone.model + " has sim card - " + secondPhone.hasSimCard);

		Call.caller = firstPhone.simMobileNumber;
		Call.receiver = secondPhone.simMobileNumber;

		Call.duration = callDuration;
		secondPhone.lastIncomingCall = firstPhone.call(Call.receiver, Call.duration, secondPhone.hasSimCard);
		System.out.println("Call is over");
		System.out.println(firstPhone.model + " sum for calls is " + firstPhone.getSumForCall() + " BGN");
		firstPhone.printInfoForTheLastOutgoingCall();
		secondPhone.printInfoForTheLastIncomingCall();
		firstPhone.removeSimCard();
		sc.close();

	}
}