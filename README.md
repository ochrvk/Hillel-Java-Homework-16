# Homework 16

### **Task 1:**   
Создать проект Maven. В корень проекта положить текстовый файл с таким содержимым:
```
{
  "name": "java",
  "persons": [
    {
      "name": "Alex",
      "age": 22
    },
    {
      "name": "Ben",
      "age": 33
    }
  ]
}
```
Распарсить этот JSON и вывести обьекты через println().  

### **Task 2*:**    
Используя библиотеку Jackson сериализовать полученные обьекты в формате XML и записать в другой файл. Информация и необходимые библиотеки:  
https://www.baeldung.com/jackson-xml-serialization-and-deserialization

```
 <dependency>
    <groupId>com.fasterxml.jackson.dataformat</groupId>
    <artifactId>jackson-dataformat-xml</artifactId>
    <version>2.9.8</version>
</dependency>
```
### **Task 3*:**    
Написать метод:  
```
    public int uniqueMorseRepresentations(String[] words) {
        
    }
```
Unique Morse Code Words

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:  
"a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.  
For convenience, the full table for the 26 letters of the English alphabet is given below:  
```
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
```

Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.   
For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). 
We'll call such a concatenation, the transformation of a word.  
Return the number of different transformations among all words we have.  

**Example:**  

Input: words = ["gin", "zen", "gig", "msg"]  
Output: 2  
Explanation:  
The transformation of each word is:  
```
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
```
There are 2 different transformations, "--...-." and "--...--.".
