# program whenever you press a button a varable increases by 1 and printed to the screen 
# start at 0 each time you press the button it counts up by 1



import time 
import RPi.GPIO as GPIO 


GPIO.setmode(GPIO.BCM) 

GPIO.setup(18, GPIO.IN, pull_up_down=GPIO.PUD_UP) 

count = 0 

while True: 
    input_state = GPIO.input(18) 
    if input_state == False: 
        count = count + 1 
        print(count) 
        time.sleep(0.2)
