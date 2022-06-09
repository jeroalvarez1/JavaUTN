
from tkinter import Tk, Label, Button, Entry #importacion de las clases que voy a utilizar

def miFuncion():
    edad = int(entIngrese.get())
    if 0 <= edad < 10:
        frase = "La infancia es increíble y bella"
    elif 10 <= edad < 20:
        frase = "Tienes muchos cambios, mucho que estudiar"
    elif 20 <= edad < 30:
        frase = "Amor y comuenza el trabajo"
    elif 30 <= edad < 66:
        frase = "Preocupate por tener una linda familia"
    elif 66 <= edad < 120:
        frase = "Visita a tu familia y aprovecha a hacer todo lo que nunca hiciste"
    else:
        frase = "La edad ingresada no es valida"
    lblResult = Entry(ventana)
    lblResult.insert(0,frase)
    lblResult.place(x=120, y=50, width=220, height=30)

ventana = Tk()
ventana.title("Frases segun edad")
ventana.geometry("350x90")


lblIngrese = Label(ventana,text="Ingrese su edad")
lblIngrese.place(x=10,y=10, width=100, height=30)

entIngrese = Entry(ventana)
entIngrese.place(x=120,y=10,width=220, height=30)

btn = Button(ventana, text="Aceptar", command= miFuncion)
#btn.config(fg= "white", bg= "#0080FF")
btn["fg"]="white"
btn["bg"]="#0080FF"
btn.place(x=10,y=50,width=100, height=30)



ventana.mainloop()

