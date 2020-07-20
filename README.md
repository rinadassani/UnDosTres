# UnDosTres
I have created a Maven Project so download Maven from it's official website. Add all the Selenium , Testng  dependencies in pom.xml file.
Run the testng.xml suite file to see the output.
Also mvn test command in the command prompt will run the project without even opening the eclipse project. ( Go to the directory in which your project is located ).
I have added browsername in data.properties file . The project can run in three browsers depending on the value you provide in data.properties i.e. chrome, firefox and IE.
Change the path of the data.properties file in FileInputSream in the base.java class as per your file path.
The captcha in the end of a successful recharge has not been automated. You will have to manually click it to proceed the script ahead. A wait for the ElementToBeClickable has been added.
