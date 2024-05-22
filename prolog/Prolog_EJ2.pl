entrada(paella).
entrada(gazpacho).
entrada(consomé).

carne(filete_de_cerdo).
carne(pollo_asado).

pescado(trucha).
pescado(bacalao).

postre(flan).
postre(helado).
postre(pastel).

bebida(agua_mineral).
bebida(vino).
bebida(cerveza).

menu(Entrada, Plato_Principal, Postre, Bebida):-
    entrada(Entrada),
   	(carne(Plato_Principal);pescado(Plato_Principal)),
    postre(Postre),
    bebida(Bebida).

menues_sin_flan(Entrada, Plato_principal, Postre, Bebida):-
    menu(Entrada, Plato_principal, Postre, Bebida),
    Postre \== flan.