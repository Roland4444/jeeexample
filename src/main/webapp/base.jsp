    <form>
        <input id="message" type="text">
        <input onclick="wsSendMessage();" value="Echo" type="button">
        <input onclick="wsCloseConnection();" value="Disconnect" type="button">
    </form>
    <br>
    <textarea id="echoText" rows="5" cols="30"></textarea>