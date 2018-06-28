package wizard_panels;

import java.util.UUID;

public class RandomStringUUID
{
    public String UID()
    {
        // Creating a random UUID (Universally unique identifier).
        UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();
	return randomUUIDString;
    }
}
