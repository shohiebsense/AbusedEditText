# AbusedEditText
Well you know, to break the colors of label, line when it's focused or not.

### Background  
You want to have EditText, wrapped inside TextInputLayout with customized color, that depends on state.  
#### States:  
Focused, unfocused  
  
  
### Resolution
1. Recognize the difference of Color and ColorStateList
2. Put the color state list in color resource folder
3. You can call the color state list res by ContextCompat.getColorStateList()
