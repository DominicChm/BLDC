package Serial.TXCommands;

import Serial.RXCommand;
import Serial.RXEnums;
import Serial.TXCommand;
import Serial.TXEnums;

public class TXTOTALDATA extends TXCommand
{
    @Override
    public byte[] getByteArray() {
        return new byte[]{getCommandByte()};
    }

    @Override
    public TXEnums getCommandEnum() {
        return TXEnums.TOTALDATA;
    }

    @Override
    public String toReadableString() {
        return "REQUEST ALL DATA";
    }

}
