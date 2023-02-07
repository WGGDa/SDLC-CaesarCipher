## Intro: Ch.1-9

> You'll need to understand what you need & objects you'll 
be using
- In order to write caesar cipher we will need to 
implement the alphabet
  - This is b/c in order to use it we need to shift the 
characters down a certain amount of characters down the 
alphabet
- Then we'll need to be able to implement an offset/shift of
characters
- Additionally, we need a message that will be offset
which will be turned into our cipher message
> Understanding:
 - This is where we start setting up are project as well as 
understand what & why we're setting up our object class 
with specific variables, method(s) & what we're trying 
to return/ what we want our response to be
 - Starting from our variables we'll need to set up our 
set static variables:
###### a. Two variables to set our char - characters & have them hold a single letter each
###### b. A String method called 'cipher' that'll pass in our String & integer fields (message, offset)
###### c. Set our offset to pass into the size of our alphabet
###### d. Pass in an array of characters to set our String message into a list
###### e. Set a return to pass in a new String of message into our character array/list
###### e. Set a call to a second method that passes in our array of characters & offset
- The goal of our cipher method is our encrypted message, 
so initially it holds our original message as a String 
& the offset that we are applying to our message
  - The offset is going to an integer/number that we'll 
offset our alphabet size by
  - Therefore, it cannot exceed the number of the size of 
the alphabet b/c we don't want it overflowing over 25
    - We can also set it in a similar manner as <offset = offset % ALPHABET_SIZE>
  - Now with our second method this will allow us to offset
our message how we want anytime it gets hit
  - Then we'll be returning our new string character
- Now we'll set up some logic in our second message so that
when it calls it inside our cipher method it will do something 
> Logic of second method 'offsetBy':
  - Now since we are covering the size of an array that will 
hold our alphabet & message we can use a regular 'for-loop' to start our logic
here. 
  - we'll start by setting the value of our loop to hold an integer value of 
zero & have it set to be less than our alphabets character length & also set
it to increment by one everytime it loops through our 'for-loop'
  -  Note: character.length is just value of characters that is in our character 
array that we determined in our cipher method which is storing our String of characters in our message
  - Then our 'for-loop' will hold({...}) another set of logic that is
basically saying that as we loop through our 'character' it will run through each and every
character in our loop, which will increase it by 1 as we have it set & it then represents each
character where it is in our array
  - We'll then create another method called 'offsetChar()' that hold's our message traversal
    - this is just us implementing our caesar cipher into our message & storing
    it into our 'character[i]'
  - Then we'll create a method for our 'offsetChar()' & set it up with our logic 
to set up our shift/rotation over to the left side 