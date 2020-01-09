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
4. Put the color list as hint text color
5. Put the hintTextAppearance (style) as activated hint text color

### Useful Links
https://developer.android.com/guide/topics/resources/color-list-resource  
https://medium.com/@Gryzor/styling-textinputlayout-and-textinputedittext-on-android-9ab786bef7af  
https://medium.com/@fast3r/this-is-brilliant-martin-thank-you-very-much-6c4a43a65df4  

https://medium.com/fw-engineering/textinputlayout-proper-theming-dde422e86c43  
https://medium.com/@Dimitris_CBR/material-text-field-proper-theming-fcd393f27d97  
