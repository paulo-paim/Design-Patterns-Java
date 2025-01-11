# Design Patterns Java - Factory

O factory Method permite a criação de diferentes tipos de objetos com base em uma interface comum.
Para aplicar este pattern, precisamos criar uma interface que retorne o objeto que queremos criar.
Após, criaremos classes que extendam e implementem a interface, retornando cada tipo de objeto especifico.

Nesta implementação apliquei este pattern a criação de uma entidade Car. Cada car pode ser de um tipo especifico (SEDAN, SUV, HATCH).
A interface CarFactory definiu o método de criação createCar e o respectivo retorno (objeto Car).
Cada implementação extende a interface e realiza a criação do Car com suas caracteristicas espeficas.

