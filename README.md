#OCP

If we wish to add a new Triangle shape then all we do is add

another child class which implements the shape interface. 

No change to GraphicalEditor is required.

Advantages:-

• no unit testing required.

• no need to understand the sourcecode from GraphicEditor.

• since the drawing code is moved to the concrete shape classes, it's a reduced risk to affect old functionality when new functionality is added.
