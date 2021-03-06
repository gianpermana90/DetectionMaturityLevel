import cv2

image = cv2.imread("image_test.jpg")
gray  = cv2.cvtColor(image,cv2.COLOR_BGR2GRAY)
ret,th1 = cv2.threshold(gray,127,255,cv2.THRESH_BINARY)
edged = cv2.Canny(th1, 10, 250)
(_, cnts, _) = cv2.findContours(th1.copy(), cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)
idx = 0
for c in cnts:
    x,y,w,h = cv2.boundingRect(c)
    if w>50 and h>50:
        idx+=1
        new_img=image[y:y+h,x:x+w]
##        cv2.imwrite(str(idx) + '.png', new_img)
        cv2.imwrite('image_object' + '.png', new_img)
        print("Object Detected")
        print("Image has been saved with name image_object.png")
##cv2.imshow("im",image)
##cv2.waitKey(0)
