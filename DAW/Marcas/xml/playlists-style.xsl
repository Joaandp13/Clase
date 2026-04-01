<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:template match="/">
    <html>
      <head>
        <title>Playlists</title>
        <style>
          body {
            font-family: Arial, sans-serif;
            background-color: #121212;
            color: #f0f0f0;
            padding: 20px;
          }
          h1 {
            color: #ff6f61;
            text-align: center;
          }
          h2 {
            color: #ff6f61;
            border-bottom: 2px solid #ff6f61;
            padding-bottom: 5px;
            margin-top: 30px;
          }
          table {
            width: 80%;
            border-collapse: collapse;
            margin-bottom: 30px;
          }
          th, td {
            border: 1px solid #444;
            padding: 10px;
            text-align: left;
          }
          th {
            background-color: #333;
            color: #ff6f61;
          }
          tr:nth-child(even) {
            background-color: #1e1e1e;
          }
          tr:hover {
            background-color: #2a2a2a;
          }
        </style>
      </head>
      <body>
        
        <xsl:for-each select="playlists/playlist">
          <h2><xsl:value-of select="@nom"/></h2>
          <table>
            <tr>
              <th>Track</th>
              <th>Título</th>
              <th>Autor</th>
              <th>Duración</th>
            </tr>
            <xsl:for-each select="track">
              <tr>
                <td><xsl:value-of select="@valor"/></td>
                <td><xsl:value-of select="nom"/></td>
                <td><xsl:value-of select="autor"/></td>
                <td><xsl:value-of select="duracio"/></td>
              </tr>
            </xsl:for-each>
          </table>
        </xsl:for-each>
      </body>
    </html>
  </xsl:template>

</xsl:stylesheet>