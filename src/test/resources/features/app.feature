Feature:Wordpress application automation
  I, as a user, want to authenticate in the application to verify my credentials

  Scenario:Wordpress application authentication
  Given en that Brandon wants to enter the Wordpress application
    When I login with the username "pruebaappappium@gmail.com" and the password "pruebaapp99"
    Then you should see the login in the application with the message Logged in as