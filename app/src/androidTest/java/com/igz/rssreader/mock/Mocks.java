package com.igz.rssreader.mock;

public class Mocks {

    public static final String VALID_XML = "\n" +
            //"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<rss version=\"2.0\" xmlns:content=\"http://purl.org/rss/1.0/modules/content/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\">\n" +
            "<channel>\n" +
            "  <title><![CDATA[Portada de EL PAÍS]]></title>\n" +
            "  <link><![CDATA[http://elpais.com/rss/elpais/portada.xml]]></link>\n" +
            "  <description><![CDATA[Portada de EL PAÍS]]></description>\n" +
            "  <lastBuildDate>Sun, 30 Apr 2017 10:27:25 +0200</lastBuildDate>\n" +
            "  <pubDate>Sun, 30 Apr 2017 10:27:25 +0200</pubDate>\n" +
            "  <language>es</language>\n" +
            "  <copyright><![CDATA[Copyright 2017, Ediciones EL PAÍS]]></copyright>\n" +
            "  <ttl>5</ttl>\n" +
            "  <image>\n" +
            "      <url>http://ep00.epimg.net/iconos/v1.x/v1.0/logos/cabecera_portada.png</url>\n" +
            "      <title>Logotipo de EL PAÍS</title>\n" +
            "      <link>http://elpais.com/</link>\n" +
            "  </image>\n" +
            "  <item>\n" +
            "    <title><![CDATA[Resurge la pesadilla para Rajoy]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/politica/2017/04/29/actualidad/1493480583_269022.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/politica/2017/04/29/actualidad/1493480583_269022.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[Rafa de Miguel, Javier Casqueiro]]></dc:creator>\n" +
            "    <description><![CDATA[El presidente pretende seguir la pauta de otros casos de corrupción y esperar a que escampe, pero la Operación Lezo amenaza con desestabilizar las instituciones]]></description>\n" +
            "    <pubDate><![CDATA[Sun, 30 Apr 2017 08:37:05 +0200]]></pubDate>\n" +
            "    <category><![CDATA[Mariano Rajoy]]></category>\n" +
            "    <category><![CDATA[PP]]></category>\n" +
            "    <category><![CDATA[Partidos políticos]]></category>\n" +
            "    <category><![CDATA[Corrupción]]></category>\n" +
            "    <category><![CDATA[Delitos]]></category>\n" +
            "    <category><![CDATA[Política]]></category>\n" +
            "    <category><![CDATA[Justicia]]></category>\n" +
            "    <content:encoded><![CDATA[<p>Las hemerotecas no son muy aleccionadoras a la hora de ver cómo reacciona el líder del PP cuando las denuncias de corrupción le desbordan. El 1 de agosto de 2013, cuando era de dominio público que el exgerente y extesorero del partido durante décadas, Luis Bárcenas, manejaba cuentas millonarias en Suiza que, en el peor de los casos, habían permanecido ocultas a la Hacienda Pública, <a href=\"http://politica.elpais.com/politica/2013/08/01/actualidad/1375359131_006587.html\">el presidente del Gobierno compareció en el Congreso para dar explicaciones</a>. “Me equivoqué, señorías. Lo lamento, pero así fue. Me equivoqué al mantener la confianza en alguien que ahora sabemos que no la merecía”, Y añadió: “Y ese ha sido todo mi papel en esta historia”.</p><p><a href=\"http://elpais.com/politica/2017/04/29/actualidad/1493480583_269022.html#?ref=rss&format=simple&link=seguir\">Seguir leyendo</a>.</p>]]></content:encoded>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/politica/imagenes/2017/04/29/actualidad/1493480583_269022_1493490276_miniatura_normal.jpg\" length=\"57800\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/politica/imagenes/2017/04/29/actualidad/1493480583_269022_1493490276_noticia_normal.jpg\" length=\"254260\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1493480583-9d179cc86fe60d9c846f067a7836a716]]></comments>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[Explíquese, señor Rajoy]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/elpais/2017/04/29/opinion/1493474851_793149.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/elpais/2017/04/29/opinion/1493474851_793149.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[El País]]></dc:creator>\n" +
            "    <description><![CDATA[El presidente no puede seguir escondiéndose detrás del silencio]]></description>\n" +
            "    <pubDate><![CDATA[Sun, 30 Apr 2017 08:47:55 +0200]]></pubDate>\n" +
            "    <category><![CDATA[Opinión]]></category>\n" +
            "    <category><![CDATA[Mariano Rajoy]]></category>\n" +
            "    <category><![CDATA[Esperanza Aguirre]]></category>\n" +
            "    <category><![CDATA[Ignacio González]]></category>\n" +
            "    <category><![CDATA[PP]]></category>\n" +
            "    <category><![CDATA[Corrupción]]></category>\n" +
            "    <category><![CDATA[Partidos políticos]]></category>\n" +
            "    <category><![CDATA[Delitos]]></category>\n" +
            "    <category><![CDATA[Justicia]]></category>\n" +
            "    <category><![CDATA[Política]]></category>\n" +
            "    <content:encoded><![CDATA[<p>La corrupción es la principal responsable de la desafección política y, como tal, uno de los problemas más graves que tiene España. El presidente del Gobierno, máximo representante de la voluntad popular, debería estar más allá de toda duda en cuanto a su ejemplaridad y ser el principal adalid en la lucha contra una lacra de consecuencias tan demoledoras para la democracia.</p><p><a href=\"http://elpais.com/elpais/2017/04/29/opinion/1493474851_793149.html#?ref=rss&format=simple&link=seguir\">Seguir leyendo</a>.</p>]]></content:encoded>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/elpais/imagenes/2017/04/29/opinion/1493474851_793149_1493475122_miniatura_normal.jpg\" length=\"16316\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/elpais/imagenes/2017/04/29/opinion/1493474851_793149_1493475122_noticia_normal.jpg\" length=\"65366\" type=\"image/jpeg\"  />\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[La decisión de Cristina Cifuentes]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/politica/2017/04/29/actualidad/1493479662_076659.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/politica/2017/04/29/actualidad/1493479662_076659.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[Javier Casqueiro]]></dc:creator>\n" +
            "    <description><![CDATA[El relevo del director general del Canal de Isabel II fue determinante para destapar operaciones en paraísos fiscales de anteriores responsables y conexiones mediáticas]]></description>\n" +
            "    <pubDate><![CDATA[Sat, 29 Apr 2017 22:08:31 +0200]]></pubDate>\n" +
            "    <category><![CDATA[Cristina Cifuentes]]></category>\n" +
            "    <category><![CDATA[Mariano Rajoy]]></category>\n" +
            "    <category><![CDATA[Gobierno Comunidad Madrid]]></category>\n" +
            "    <category><![CDATA[Gobierno autonómico]]></category>\n" +
            "    <category><![CDATA[PP]]></category>\n" +
            "    <category><![CDATA[Corrupción]]></category>\n" +
            "    <category><![CDATA[Política autonómica]]></category>\n" +
            "    <category><![CDATA[Comunidades autónomas]]></category>\n" +
            "    <category><![CDATA[Partidos políticos]]></category>\n" +
            "    <category><![CDATA[Administración autonómica]]></category>\n" +
            "    <category><![CDATA[Delitos]]></category>\n" +
            "    <category><![CDATA[Justicia]]></category>\n" +
            "    <category><![CDATA[Política]]></category>\n" +
            "    <category><![CDATA[Administración pública]]></category>\n" +
            "    <content:encoded><![CDATA[<p>Una operaria levantó el miércoles pasado las alfombras de los pasillos que dan al despacho de Presidencia de la Comunidad de Madrid, que entre 2012 y 2015 perteneció a <a href=\"http://elpais.com/tag/jaime_ignacio_gonzalez_gonzalez/a/\" target=\"_blank\">Ignacio González</a>. Cristina Cifuentes, su excompañera y sucesora en el cargo, supo apreciar el patente contenido metafórico de esa operación de limpieza. La semana ha sido dura y dolorosa para el PP —otra más—, como explicó la propia Cifuentes <a href=\"http://politica.elpais.com/politica/2017/04/27/actualidad/1493306232_817904.html\" target=\"_blank\">en su discurso ante la ejecutiva regional reunida el jueves</a> con urgencia para tratar de exorcizar los demonios internos.</p><p><a href=\"http://elpais.com/politica/2017/04/29/actualidad/1493479662_076659.html#?ref=rss&format=simple&link=seguir\">Seguir leyendo</a>.</p>]]></content:encoded>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/politica/imagenes/2017/04/29/actualidad/1493479662_076659_1493486605_miniatura_normal.jpg\" length=\"19306\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/politica/imagenes/2017/04/29/actualidad/1493479662_076659_1493486605_noticia_normal.jpg\" length=\"57046\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1493479662-ee72803bc801937856ff3133c6915068]]></comments>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[La propaganda de Corea del Norte ‘hace estallar’ la Casa Blanca y el Capitolio]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/internacional/2017/04/29/estados_unidos/1493488767_303089.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/internacional/2017/04/29/estados_unidos/1493488767_303089.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[Jan Martínez Ahrens]]></dc:creator>\n" +
            "    <description><![CDATA[Un vídeo del régimen de Pyongyang llama a la guerra contra Estados Unidos y muestra la destrucción de sus símbolos]]></description>\n" +
            "    <pubDate><![CDATA[Sun, 30 Apr 2017 00:15:29 +0200]]></pubDate>\n" +
            "    <category><![CDATA[Donald Trump]]></category>\n" +
            "    <category><![CDATA[Corea del Norte]]></category>\n" +
            "    <category><![CDATA[Ejército tierra]]></category>\n" +
            "    <category><![CDATA[Fuerzas armadas]]></category>\n" +
            "    <category><![CDATA[Estados Unidos]]></category>\n" +
            "    <category><![CDATA[China]]></category>\n" +
            "    <category><![CDATA[Norteamérica]]></category>\n" +
            "    <category><![CDATA[Asia oriental]]></category>\n" +
            "    <category><![CDATA[Asia]]></category>\n" +
            "    <category><![CDATA[Defensa]]></category>\n" +
            "    <category><![CDATA[América]]></category>\n" +
            "    <content:encoded><![CDATA[<p>La Casa Blanca y el Capitolio por los aires. Un portaaviones en llamas. El bravo Ejército de Corea del Norte victorioso. La propaganda ha irrumpido en la escalada de tensión entre Washington y Pyongyang. Un vídeo liberado por el opresivo régimen norcoreano muestra imágenes de destrucción y victoria en un posible conflicto. A lo largo de dos minutos y medio, esta obra casi pop al servicio del Líder Supremo, Kim Jong-un, lanza inflamados mensajes contra el “enemigo a destruir” y se jacta de la capacidad militar de Corea del Norte. “Os enseñaremos lo que un país fuerte que lidera el mundo en tecnología balística y nuclear puede hacer”.</p><p><a href=\"http://elpais.com/internacional/2017/04/29/estados_unidos/1493488767_303089.html#?ref=rss&format=simple&link=seguir\">Seguir leyendo</a>.</p>]]></content:encoded>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/internacional/imagenes/2017/04/29/estados_unidos/1493488767_303089_1493503569_miniatura_normal.jpg\" length=\"17821\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1493503551-8853bbc51c47fb6f07a57e37c8910568]]></comments>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[El Papa cree que el conflicto entre EE UU y Corea del Norte “se ha calentado demasiado”]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/internacional/2017/04/30/actualidad/1493537367_462364.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/internacional/2017/04/30/actualidad/1493537367_462364.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[Daniel Verdú]]></dc:creator>\n" +
            "    <description><![CDATA[El Pontífice asegura también que está dispuesto a volver a mediar en la situación política que vive Venezuela si se garantizan unas mínimas condiciones]]></description>\n" +
            "    <pubDate><![CDATA[Sun, 30 Apr 2017 09:42:23 +0200]]></pubDate>\n" +
            "    <category><![CDATA[Papa Francisco]]></category>\n" +
            "    <category><![CDATA[Donald Trump]]></category>\n" +
            "    <category><![CDATA[Corea del Norte]]></category>\n" +
            "    <category><![CDATA[Venezuela]]></category>\n" +
            "    <category><![CDATA[Papa]]></category>\n" +
            "    <category><![CDATA[Clero]]></category>\n" +
            "    <category><![CDATA[Iglesia católica]]></category>\n" +
            "    <category><![CDATA[Asia oriental]]></category>\n" +
            "    <category><![CDATA[Cristianismo]]></category>\n" +
            "    <category><![CDATA[Asia]]></category>\n" +
            "    <category><![CDATA[Sudamérica]]></category>\n" +
            "    <category><![CDATA[Latinoamérica]]></category>\n" +
            "    <category><![CDATA[Religión]]></category>\n" +
            "    <category><![CDATA[América]]></category>\n" +
            "    <content:encoded><![CDATA[<p>El <a href=\"http://elpais.com/tag/francisco_i/a\">papa Francisco</a> repasó en el viaje de vuelta de <a href=\"http://internacional.elpais.com/internacional/2017/04/28/actualidad/1493391693_159764.html\">su visita a Egipto</a> algunos temas de la actualidad política mundial. En la tradicional audiencia que concede a los periodistas en pleno vuelo y donde se le puede preguntar por cualquier asunto, el Pontífice se mostró especialmente preocupado por el conflicto entre Corea del Norte y EE UU y con la situación de Venezuela. Para ambos casos invocó la conveniencia de una mediación adecuada.</p><p><a href=\"http://elpais.com/internacional/2017/04/30/actualidad/1493537367_462364.html#?ref=rss&format=simple&link=seguir\">Seguir leyendo</a>.</p>]]></content:encoded>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/internacional/imagenes/2017/04/30/actualidad/1493537367_462364_1493537581_miniatura_normal.jpg\" length=\"20348\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/internacional/imagenes/2017/04/30/actualidad/1493537367_462364_1493537581_noticia_normal.jpg\" length=\"67123\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1493537367-8fd0939f5780e38a3cc738046d37af13]]></comments>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[Trump recrudece sus ataques a la prensa en un discurso para celebrar 100 días de presidencia]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/internacional/2017/04/30/estados_unidos/1493513639_642065.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/internacional/2017/04/30/estados_unidos/1493513639_642065.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[Cristina F. Pereda]]></dc:creator>\n" +
            "    <description><![CDATA[El mandatario conmemora la fecha con un evento en Pensilvania en el que calificó a los medios de “desgracia”]]></description>\n" +
            "    <pubDate><![CDATA[Sun, 30 Apr 2017 06:17:53 +0200]]></pubDate>\n" +
            "    <category><![CDATA[Donald Trump]]></category>\n" +
            "    <category><![CDATA[Elecciones EEUU 2016]]></category>\n" +
            "    <category><![CDATA[Elecciones EE UU]]></category>\n" +
            "    <category><![CDATA[Estados Unidos]]></category>\n" +
            "    <category><![CDATA[Elecciones presidenciales]]></category>\n" +
            "    <category><![CDATA[Norteamérica]]></category>\n" +
            "    <category><![CDATA[Elecciones]]></category>\n" +
            "    <category><![CDATA[América]]></category>\n" +
            "    <category><![CDATA[Política]]></category>\n" +
            "    <content:encoded><![CDATA[<p dir=\"ltr\">Donald Trump, nada más ganar las elecciones, <a href=\"http://internacional.elpais.com/internacional/2017/04/28/actualidad/1493380137_826652.html\">presumió de lo que haría en sus primeros 100 días</a> en el poder. Después dijo que el aniversario no es tan importante. Finalmente, decidió conmemorarlo con un gran evento en Pensilvania. <a href=\"http://elpais.com/tag/donald_trump/a/\">El presidente de Estados Unidos</a>, sin embargo, dedicó los primeros doce minutos de su discurso a atacar a los medios de comunicación, que esta misma noche celebraban en Washington su tradicional cena de corresponsales. Trump se negó a ir y este sábado se aseguró durante su discurso de que todos los asistentes entendieran por qué: “Se merecen un suspenso bien gordo, son una desgracia”.</p><p><a href=\"http://elpais.com/internacional/2017/04/30/estados_unidos/1493513639_642065.html#?ref=rss&format=simple&link=seguir\">Seguir leyendo</a>.</p>]]></content:encoded>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/elpais/imagenes/2017/04/30/portada/1493525889_388324_1493533905_miniatura_normal.jpg\" length=\"17631\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/internacional/imagenes/2017/04/30/estados_unidos/1493513639_642065_1493513780_noticia_normal.jpg\" length=\"66023\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1493515833-6b364dfeaec043134552f3362b2022bc]]></comments>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[El caso del cura pedófilo que desafía al Papa]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/internacional/2017/04/29/actualidad/1493494657_943625.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/internacional/2017/04/29/actualidad/1493494657_943625.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[Carlos E. Cué]]></dc:creator>\n" +
            "    <description><![CDATA[Julio Grassi fue el sacerdote más mediático de Argentina. Está condenado a 15 años de cárcel. Bergoglio no lo ha expulsado ni contesta las cartas de las víctimas]]></description>\n" +
            "    <pubDate><![CDATA[Sat, 29 Apr 2017 22:07:45 +0200]]></pubDate>\n" +
            "    <category><![CDATA[Papa Francisco]]></category>\n" +
            "    <category><![CDATA[Pederastia]]></category>\n" +
            "    <category><![CDATA[Argentina]]></category>\n" +
            "    <category><![CDATA[Abuso menores]]></category>\n" +
            "    <category><![CDATA[Papa]]></category>\n" +
            "    <category><![CDATA[Agresiones sexuales]]></category>\n" +
            "    <category><![CDATA[Clero]]></category>\n" +
            "    <category><![CDATA[Delitos sexuales]]></category>\n" +
            "    <category><![CDATA[Iglesia católica]]></category>\n" +
            "    <category><![CDATA[Sudamérica]]></category>\n" +
            "    <category><![CDATA[Latinoamérica]]></category>\n" +
            "    <category><![CDATA[Cristianismo]]></category>\n" +
            "    <category><![CDATA[Delitos]]></category>\n" +
            "    <category><![CDATA[América]]></category>\n" +
            "    <category><![CDATA[Religión]]></category>\n" +
            "    <category><![CDATA[Justicia]]></category>\n" +
            "    <content:encoded><![CDATA[<p>Era el cura preferido de los ricos. Una auténtica estrella mediática, el religioso más famoso de Argentina. Desfilaba por todas las televisiones en los noventa, su gran momento. Con apoyo del Gobierno de Carlos Menem y de algunas de las personas más acaudaladas de Argentina, como Amalita Fortabat, <a href=\"http://internacional.elpais.com/internacional/2009/06/10/actualidad/1244584817_850215.html\">Julio Grassi se movía cómodo en los platós</a> y recaudaba enormes cantidades de dinero para su fundación, Felices los Niños, que llegó a acoger a 6.300 menores de la calle. Eran tiempos duros de ajuste en los que era frecuente <a href=\"http://internacional.elpais.com/internacional/2009/06/10/actualidad/1244584817_850215.html\">ver a chavales sin hogar en Buenos Aires</a>. En 2002 llegó el escándalo. El país se paralizó para ver un programa de investigación en televisión, <em>Telenoche,</em>en el que tres de esos niños desvalidos, de entre 14 y 16 años, que dependían de Grassi para todo, contaban los abusos sexuales a los que les sometía. Argentina enmudeció.</p><p><a href=\"http://elpais.com/internacional/2017/04/29/actualidad/1493494657_943625.html#?ref=rss&format=simple&link=seguir\">Seguir leyendo</a>.</p>]]></content:encoded>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/internacional/imagenes/2017/04/29/actualidad/1493494657_943625_1493495087_miniatura_normal.jpg\" length=\"18988\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/internacional/imagenes/2017/04/29/actualidad/1493494657_943625_1493495087_noticia_normal.jpg\" length=\"70396\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1493494657-6eb208ec4e46c7916812f30495315a68]]></comments>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[La mafia de ‘El Padrino’ no necesita efectos especiales]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/cultura/2017/04/29/actualidad/1493468365_450982.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/cultura/2017/04/29/actualidad/1493468365_450982.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[Sandro Pozzi]]></dc:creator>\n" +
            "    <description><![CDATA[De Niro congrega a Coppola, Pacino, Keaton, Duvall y Caan para celebrar los 45 años del estreno de la mítica película\n" +
            "El director lleva la voz cantante en un coloquio en el que se recordó a Brando imitándolo]]></description>\n" +
            "    <pubDate><![CDATA[Sun, 30 Apr 2017 08:05:22 +0200]]></pubDate>\n" +
            "    <category><![CDATA[Francis Ford Coppola]]></category>\n" +
            "    <category><![CDATA[Robert de Niro]]></category>\n" +
            "    <category><![CDATA[Al Pacino]]></category>\n" +
            "    <category><![CDATA[James Caan]]></category>\n" +
            "    <category><![CDATA[Robert Duvall]]></category>\n" +
            "    <category><![CDATA[Diane Keaton]]></category>\n" +
            "    <category><![CDATA[Taylor Hackford]]></category>\n" +
            "    <category><![CDATA[Cine clásico]]></category>\n" +
            "    <category><![CDATA[Cine americano]]></category>\n" +
            "    <category><![CDATA[Nueva York]]></category>\n" +
            "    <category><![CDATA[Mafia]]></category>\n" +
            "    <category><![CDATA[Crimen organizado]]></category>\n" +
            "    <category><![CDATA[Estados Unidos]]></category>\n" +
            "    <category><![CDATA[Delincuencia]]></category>\n" +
            "    <category><![CDATA[Norteamérica]]></category>\n" +
            "    <category><![CDATA[Cine]]></category>\n" +
            "    <category><![CDATA[América]]></category>\n" +
            "    <category><![CDATA[Justicia]]></category>\n" +
            "    <content:encoded><![CDATA[<p>La <em>familia</em> volvió a reunirse la noche del sábado en Nueva York para conmemorar lo que les unió hace casi medio siglo: <a href=\"http://cultura.elpais.com/cultura/2015/05/06/actualidad/1430934529_920426.html\">el estreno de <em>El Padrino</em>.</a> Fue un encuentro único para celebra uno de los grandes clásicos del cine. Difícilmente se volverá a repetir jamás una mezcla de talento tan influyente en la cultura audiovisual americana.</p><p><a href=\"http://elpais.com/cultura/2017/04/29/actualidad/1493468365_450982.html#?ref=rss&format=simple&link=seguir\">Seguir leyendo</a>.</p>]]></content:encoded>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/cultura/imagenes/2017/04/29/actualidad/1493468365_450982_1493521174_miniatura_normal.jpg\" length=\"18764\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/cultura/imagenes/2017/04/29/actualidad/1493468365_450982_1493521174_noticia_normal.jpg\" length=\"56646\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1493530396-e307512f30b2add1cf2cb63dadcee8cf]]></comments>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[Cinco series que no te puedes perder en mayo]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/cultura/2017/04/28/television/1493386761_156567.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/cultura/2017/04/28/television/1493386761_156567.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[Natalia Marcos]]></dc:creator>\n" +
            "    <description><![CDATA[Un repaso a algunos de los títulos imprescindibles entre la ficción internacional de este mes]]></description>\n" +
            "    <pubDate><![CDATA[Sat, 29 Apr 2017 21:39:42 +0200]]></pubDate>\n" +
            "    <category><![CDATA[Twin Peaks]]></category>\n" +
            "    <category><![CDATA[House of Cards]]></category>\n" +
            "    <category><![CDATA[Series drama]]></category>\n" +
            "    <category><![CDATA[Series detectives]]></category>\n" +
            "    <category><![CDATA[Series americanas]]></category>\n" +
            "    <category><![CDATA[Series ciencia ficción]]></category>\n" +
            "    <category><![CDATA[ABC Televisión]]></category>\n" +
            "    <category><![CDATA[Series suspense]]></category>\n" +
            "    <category><![CDATA[Series crímenes]]></category>\n" +
            "    <category><![CDATA[Netflix]]></category>\n" +
            "    <category><![CDATA[Amazon Studios]]></category>\n" +
            "    <category><![CDATA[Series comedia]]></category>\n" +
            "    <category><![CDATA[Amazon]]></category>\n" +
            "    <category><![CDATA[Géneros series]]></category>\n" +
            "    <category><![CDATA[Plataformas digitales]]></category>\n" +
            "    <category><![CDATA[Series televisión]]></category>\n" +
            "    <category><![CDATA[Televisión IP]]></category>\n" +
            "    <category><![CDATA[Programa televisión]]></category>\n" +
            "    <category><![CDATA[Televisión]]></category>\n" +
            "    <category><![CDATA[Programación]]></category>\n" +
            "    <category><![CDATA[Medios comunicación]]></category>\n" +
            "    <category><![CDATA[Telecomunicaciones]]></category>\n" +
            "    <category><![CDATA[Comunicación]]></category>\n" +
            "    <category><![CDATA[Comunicaciones]]></category>\n" +
            "    <content:encoded><![CDATA[<p><em><strong>- American Gods</strong></em></p><p><a href=\"http://elpais.com/cultura/2017/04/28/television/1493386761_156567.html#?ref=rss&format=simple&link=seguir\">Seguir leyendo</a>.</p>]]></content:encoded>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/cultura/imagenes/2017/04/28/television/1493386761_156567_1493398584_miniatura_normal.jpg\" length=\"16535\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/cultura/imagenes/2017/04/28/television/1493386761_156567_1493398584_noticia_normal.jpg\" length=\"55955\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1493489779-8f203b6ef8255b8aad95418196a2f4ae]]></comments>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[Siete trabajos con los que ganar un buen sueldo sin estrés ni renuncias]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/elpais/2017/04/25/fotorrelato/1493132904_858738.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/elpais/2017/04/25/fotorrelato/1493132904_858738.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[BuenaVida]]></dc:creator>\n" +
            "    <description><![CDATA[Porque llegar a casa destrozado no compensa, pero que los ingresos no den ni para el alquiler, tampoco. Hacemos la media entre salario y calma para dar con esta lista de empleos soñados]]></description>\n" +
            "    <pubDate><![CDATA[Sat, 29 Apr 2017 18:10:06 +0200]]></pubDate>\n" +
            "    <category><![CDATA[Día internacional trabajo]]></category>\n" +
            "    <category><![CDATA[Bienestar]]></category>\n" +
            "    <category><![CDATA[Relaciones laborales]]></category>\n" +
            "    <category><![CDATA[Estilo vida]]></category>\n" +
            "    <category><![CDATA[Trabajo]]></category>\n" +
            "    <category><![CDATA[Economía]]></category>\n" +
            "    <category><![CDATA[Sociedad]]></category>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/elpais/imagenes/2017/04/25/fotorrelato/1493132904_858738_1493133264_miniatura_normal.jpg\" length=\"17190\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/elpais/imagenes/2017/04/25/fotorrelato/1493132904_858738_1493133264_noticia_normal.jpg\" length=\"79390\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1493217916-1d3add17a536a983388bac1e665aa6b4]]></comments>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[El arte de Mourinho]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/deportes/2017/04/29/actualidad/1493459175_440739.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/deportes/2017/04/29/actualidad/1493459175_440739.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[John Carlin]]></dc:creator>\n" +
            "    <description><![CDATA[Desde que se jubiló en 2013 Alex Ferguson, entrenador del United durante 27 años, Old Trafford es un teatro que da sueño]]></description>\n" +
            "    <pubDate><![CDATA[Sat, 29 Apr 2017 11:50:47 +0200]]></pubDate>\n" +
            "    <category><![CDATA[John Carlin]]></category>\n" +
            "    <category><![CDATA[José Mourinho]]></category>\n" +
            "    <category><![CDATA[Pep Guardiola]]></category>\n" +
            "    <category><![CDATA[Manchester United]]></category>\n" +
            "    <category><![CDATA[Premier League]]></category>\n" +
            "    <category><![CDATA[Ligas fútbol]]></category>\n" +
            "    <category><![CDATA[Equipos]]></category>\n" +
            "    <category><![CDATA[Fútbol]]></category>\n" +
            "    <category><![CDATA[Competiciones]]></category>\n" +
            "    <category><![CDATA[Deportes]]></category>\n" +
            "    <content:encoded><![CDATA[<p class=\"separador_poesia\"> <em>“Ganar dinero es arte.”</em> Andy Warhol</p><p><a href=\"http://elpais.com/deportes/2017/04/29/actualidad/1493459175_440739.html#?ref=rss&format=simple&link=seguir\">Seguir leyendo</a>.</p>]]></content:encoded>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/deportes/imagenes/2017/04/29/actualidad/1493459175_440739_1493459331_miniatura_normal.jpg\" length=\"17367\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/deportes/imagenes/2017/04/29/actualidad/1493459175_440739_1493459331_noticia_normal.jpg\" length=\"63516\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/deportes/imagenes/2017/04/29/actualidad/1493459175_440739_1493459331_portadilla_grande.jpg\" length=\"86496\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1493459175-ca3eed35bce803ef44debed87eb964cd]]></comments>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[Sergio Llull, el dueño del último segundo en el basket]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/elpais/2017/04/30/portada/1493536382_703151.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/elpais/2017/04/30/portada/1493536382_703151.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[Faustino Sáez]]></dc:creator>\n" +
            "    <description><![CDATA[]]></description>\n" +
            "    <pubDate><![CDATA[Sun, 30 Apr 2017 09:13:02 +0200]]></pubDate>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/elpais/imagenes/2017/01/11/actualidad/1484124444_216211_1493362504_miniatura_normal.jpg\" length=\"12375\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/elpais/imagenes/2017/01/11/actualidad/1484124444_216211_1490682406_noticia_normal.jpg\" length=\"118227\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1484124444-6d74322f30bd5d9a5eba58074ef75686]]></comments>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[Esta mujer cuenta cómo ha sido su experiencia tras un año sin depilarse]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/verne/2017/04/26/articulo/1493198220_582790.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/verne/2017/04/26/articulo/1493198220_582790.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[Verne]]></dc:creator>\n" +
            "    <description><![CDATA[\"Me encanta ser la versión más natural y más humana de mí misma\", cuenta]]></description>\n" +
            "    <pubDate><![CDATA[Sun, 30 Apr 2017 10:05:31 +0200]]></pubDate>\n" +
            "    <category><![CDATA[Feminismo]]></category>\n" +
            "    <category><![CDATA[Mujeres]]></category>\n" +
            "    <category><![CDATA[Sociedad]]></category>\n" +
            "    <content:encoded><![CDATA[<p>Los cánones de belleza femenina <a href=\"http://verne.elpais.com/verne/2017/04/05/articulo/1491402331_906051.html\">no solo estigmatizan sobre peso y talla,</a> también sobre el vello corporal. La estadounidense Morgan Mikenas, con 67.000 seguidores en Instagram, donde sobre todo publica fotos haciendo ejercicio, dejó de depilarse hace un año y desde hace meses comparte fotos donde visibiliza el vello de su cuerpo.</p><p><a href=\"http://elpais.com/verne/2017/04/26/articulo/1493198220_582790.html#?ref=rss&format=simple&link=seguir\">Seguir leyendo</a>.</p>]]></content:encoded>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/verne/imagenes/2017/04/26/articulo/1493198220_582790_1493200569_miniatura_normal.jpg\" length=\"20735\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/verne/imagenes/2017/04/26/articulo/1493198220_582790_1493200569_portadilla_normal.jpg\" length=\"75023\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1493539497-fe1e4b2505703614efc9c7fb3d52cd28]]></comments>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <title><![CDATA[La verdadera historia de las noticias falsas]]></title>\n" +
            "    <link><![CDATA[http://elpais.com/cultura/2017/04/28/actualidad/1493389536_863123.html#?ref=rss&format=simple&link=link]]></link>\n" +
            "    <guid isPermaLink=\"true\"><![CDATA[http://elpais.com/cultura/2017/04/28/actualidad/1493389536_863123.html#?ref=rss&format=simple&link=guid]]></guid>\n" +
            "    <dc:creator><![CDATA[Robert Darnton]]></dc:creator>\n" +
            "    <description><![CDATA[Siglos antes de las redes sociales, los bulos y las mentiras alimentaban pasquines y gacetas en Europa. Las informaciones infundadas corrían por los parques hasta llegar a primera página]]></description>\n" +
            "    <pubDate><![CDATA[Sun, 30 Apr 2017 09:13:52 +0200]]></pubDate>\n" +
            "    <category><![CDATA[Francia]]></category>\n" +
            "    <category><![CDATA[Europa occidental]]></category>\n" +
            "    <category><![CDATA[Europa]]></category>\n" +
            "    <category><![CDATA[España]]></category>\n" +
            "    <category><![CDATA[Política]]></category>\n" +
            "    <category><![CDATA[Telecomunicaciones]]></category>\n" +
            "    <category><![CDATA[Sociedad]]></category>\n" +
            "    <category><![CDATA[Comunicaciones]]></category>\n" +
            "    <content:encoded><![CDATA[<p dir=\"ltr\">En la larga historia de la desinformación, el <a href=\"http://elpais.com/elpais/2017/01/21/opinion/1485023813_514702.html\">estallido actual de noticias falsas</a>ocupa ya un lugar especial, con una asesora presidencial, <a href=\"http://internacional.elpais.com/internacional/2016/12/22/estados_unidos/1482414369_648529.html\">Kellyanne Conway</a>, que llegó a sacarse de la manga <a href=\"http://internacional.elpais.com/internacional/2017/02/06/estados_unidos/1486420643_120708.html\">una matanza en Kentucky</a> para defender que se prohibiera la entrada en el país a <a href=\"http://internacional.elpais.com/internacional/2017/01/27/estados_unidos/1485551816_434347.html\">viajeros de siete países musulmanes</a>. Pero la invención de verdades alternativas no es tan infrecuente, y se pueden encontrar equivalentes a los mensajes de texto y los tuits llenos de veneno de hoy en casi todos los periodos de la historia, incluso en la Antigüedad.</p><p><a href=\"http://elpais.com/cultura/2017/04/28/actualidad/1493389536_863123.html#?ref=rss&format=simple&link=seguir\">Seguir leyendo</a>.</p>]]></content:encoded>\n" +
            "    <enclosure url=\"http://ep00.epimg.net/internacional/imagenes/2017/04/28/actualidad/1493381890_636565_1493382405_miniatura_normal.jpg\" length=\"35023\" type=\"image/jpeg\"  />\n" +
            "    <enclosure url=\"http://ep00.epimg.net/internacional/imagenes/2017/04/28/actualidad/1493381890_636565_1493382405_noticia_normal.jpg\" length=\"143502\" type=\"image/jpeg\"  />\n" +
            "    <comments><![CDATA[http://eskup.elpais.com/C1493389609-ceb45e49df37adb7d8cc58801b25b3ec]]></comments>\n" +
            "  </item>\n" +
            "</channel>\n" +
            "</rss>\n";

}
