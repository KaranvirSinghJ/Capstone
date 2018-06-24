#include <SoftwareSerial.h>
SoftwareSerial gsm(11, 12);

#include <LiquidCrystal.h>
const int rs = 10, en = 9, d4 = 8, d5 = 7, d6 = 6, d7 = 5;
LiquidCrystal lcd(rs, en, d4, d5, d6, d7);
int value;
long last = 0;
volatile int rpmcount = 0;
int rpm= 0;
unsigned long lastmillis = 0;
void setup() {
    gsm.begin(9600);
    Serial.begin(9600);
    lcd.begin(16, 2);
    attachInterrupt(1, rpm_fan, FALLING);
}
void loop() {
  if(analogRead(A0)>513){
      value++; 
  if(millis()-last>1000){
     detachInterrupt(0);
     attachInterrupt(1, rpm_fan, FALLING);
      rpm= rpmcount * 60;
      rpmcount = 0;
      Serial.print("m/s: ");
      Serial.print(((2* 3.1415926536 *0.00003 * rpm * 60*5)/1000*18));
      Serial.print("\tbpm: ");
      Serial.println(value/22);
      lcd.clear();
      lcd.setCursor(0, 0);
      lcd.print("m/s = ");
      lcd.setCursor(0, 1);
      lcd.print("bpm = ");
      lcd.setCursor(7, 0);
      lcd.print(((2* 3.1415926536 *0.00003 * rpm * 60*5)/1000*18));
      lcd.setCursor(7, 1);
      lcd.print(value/22); 
      if(((2* 3.1415926536 *0.00003 * rpm * 60*5)/1000*18)>2.0){
         digitalWrite(2,HIGH);
         gsm.println("AT+CMGF=1");   
         delay(1000);
         gsm.println("AT+CMGS=\"+917888510274\"\r"); 
          delay(1000);
          gsm.println("Vehicle Overspeeds");
          delay(200);
          gsm.println((char)26);
         delay(100);

      }
      else{
        digitalWrite(2,LOW);
      }
      if((value/22)<50 && (value/22)>10){
        digitalWrite(4,HIGH);
        gsm.println("AT+CMGF=1");   
         delay(1000);
         gsm.println("AT+CMGS=\"+917888510274\"\r"); 
          delay(1000);
          gsm.println("Person Sleeping");
          delay(200);
          gsm.println((char)26);
         delay(100);
      }
      else{
        digitalWrite(4,LOW);
      }
      
      value=0;
      lastmillis=millis();  last=millis();
  }
  }
  else{
  if(millis()-last>1000){
        detachInterrupt(0);
          attachInterrupt(1, rpm_fan, FALLING);
        rpm= rpmcount * 60;
        rpmcount = 0; // Restart the RPM counter
        Serial.print("m/s: ");
        Serial.print(((2* 3.1415926536 *0.00003 * rpm * 60*5)/1000*18));
        Serial.print("\tbpm: ");
        Serial.println(value/22);
        lcd.clear();
        lcd.setCursor(0, 0);
        lcd.print("m/s = ");
        lcd.setCursor(0, 1);
        lcd.print("bpm = ");
        lcd.setCursor(7, 0);
        lcd.print(((2* 3.1415926536 *0.00003 * rpm * 60*5)/1000*18)); 
        lcd.setCursor(7, 1);
        lcd.print(value/22); 

 if(((2* 3.1415926536 *0.00003 * rpm * 60*5)/1000*18)>2.0){
        digitalWrite(2,HIGH);
        gsm.println("AT+CMGF=1");   
         delay(100);
         gsm.println("AT+CMGS=\"+917888510274\"\r"); 
          delay(100);
          gsm.println("Vehicle Overspeeds");
          delay(100);
          gsm.println((char)26);
         delay(100);
      }
      else{
        digitalWrite(2,LOW);
      }
      if((value/22)<50 && (value/22)>10){
        digitalWrite(4,HIGH);
        gsm.println("AT+CMGF=1");   
         delay(1000);
         gsm.println("AT+CMGS=\"+917888510274\"\r"); 
          delay(1000);
          gsm.println("Person Sleeping");
          delay(200);
          gsm.println((char)26);
         delay(100);
      }
      else{
        digitalWrite(4,LOW);
      }
        
        value=0;
        lastmillis=millis();  last=millis();
       }
}


}
void rpm_fan(){
    rpmcount++;
}
