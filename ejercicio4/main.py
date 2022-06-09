from tkinter import Tk, Label, Button, Entry, font

def calcular():
    nota = float(entIngrese.get())
    if 9 <= nota <= 10:
        calificacion = "A"
    elif 8 <= nota < 9:
        calificacion = "B"
    elif 7 <= nota < 8:
        calificacion = "C"
    elif 6 <= nota < 7:
        calificacion = "D"
    elif 0 <= nota < 6:
        calificacion = "F"
    else:
        calificacion = "Valor ingresado incorrecto"
    entResult.delete(0, "end")
    entResult.insert(0,calificacion)

#colors
marronTrigo = "#F5DEB3"
marronBronceado = "#D2B48C"
marronFuerte = "#DEB887"
#fonts
myfont12Bold = 'Helvetica', 12, 'bold'
myfont12 = 'Helvetica', 12

def personalizacion01(etiqueta):
    etiqueta["font"]= myfont12Bold
    etiqueta["bg"] = marronTrigo

def personalizacion02(etiqueta):
    etiqueta["font"]= myfont12
    etiqueta["bg"] = marronTrigo

def personalizacion03(etiqueta):
    etiqueta["font"]= myfont12Bold
    etiqueta["bg"] = marronBronceado
#

ventana = Tk()
ventana.title("Sistema de Calificaciones")
ventana["bg"]= marronFuerte
ventana.geometry("360x90")

lblIngrese = Label(ventana, text="Ingrese su nota: ")
lblIngrese.place(relx=0.05, rely=0.05, relwidth=0.425, relheight=0.425)
personalizacion01(lblIngrese)

entIngrese = Entry(ventana)
entIngrese.place(relx=0.525, rely=0.05, relwidth=0.425, relheight=0.425)
personalizacion02(entIngrese)

btn = Button(ventana, text="Aceptar", command=calcular)
btn.place(relx=0.05, rely=0.525, relwidth=0.425, relheight=0.425)
personalizacion03(btn)

entResult = Entry(ventana)
entResult.place(relx=0.525, rely=0.525, relwidth=0.425, relheight=0.425)
personalizacion02(entResult)

ventana.mainloop()