<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
<html>
<head>
    <title>Smartphones</title>
    <link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>

<h1>📱 Catálogo de Smartphones</h1>

<xsl:for-each select="smartphones/smartphone">
    <div class="card">

        <h2><xsl:value-of select="model"/></h2>

        <p><strong>Sistema:</strong> 
            <xsl:value-of select="sistema_operatiu/nom"/> 
            <xsl:text> </xsl:text>
            <xsl:value-of select="sistema_operatiu/versio"/>
        </p>

        <p><strong>Dimensiones:</strong>
            <xsl:value-of select="dimensions/alcada"/> x 
            <xsl:value-of select="dimensions/amplada"/> x 
            <xsl:value-of select="dimensions/gruix"/> mm
        </p>

        <p><strong>Peso:</strong> 
            <xsl:value-of select="pes"/> g
        </p>

        <p><strong>Resolución:</strong> 
            <xsl:value-of select="resolucio"/>
        </p>

        <p><strong>Procesador:</strong> 
            <xsl:value-of select="processador"/>
        </p>

        <p><strong>RAM:</strong> 
            <xsl:value-of select="memoriaRAM"/> GB
        </p>

        <h3>💾 Precios por capacidad</h3>
        <table class="tabla-precios">
            <tr>
                <th>Capacidad</th>
                <th>Precio (€)</th>
            </tr>

            <xsl:for-each select="preus/preu">
                <tr>
                    <td><xsl:value-of select="@capacitat"/></td>
                    <td><xsl:value-of select="."/></td>
                </tr>
            </xsl:for-each>

        </table>

    </div>
</xsl:for-each>

</body>
</html>
</xsl:template>

</xsl:stylesheet>