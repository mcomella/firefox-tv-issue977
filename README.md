## Steps to reproduce
- Install on Fire TV Cube
- Wait a bit for page to load
- Click any remote button

## Expected
Google loads

## Actual
Nothing-ish. The page seems to reload when a key is pressed: the screen
flickers and the console prints an ascii "CNN" each time.

- You can reproduce the same way in Firefox by waiting for the page to load
  fully, then trying to navigate (e.g. reload, back, or home -> site).
- I can't reproduce in the android emulator.
- If you change the initial web site load to another one, you can no longer
reproduce.
