# RSL-bis Scenarios - Selected Examples

The original project uses RSL-bis notation to describe main and alternative scenarios for selected use cases.

## PU001 - Scan QR code

```text
Use case Scan QR code Main scenario
00: Player <select> scan QR code
01: System <show> scanner view
02: Player <enter> QR code readout
03: Player <select> confirm scan
04: System <check> QR code
[QR code ? VALID]
05: System <read> game object
06: System <show> game object card
07: Player <select> close
-> end ! OK
```

Alternative scenario:

```text
[QR code ? INVALID]
A1: System <show> invalid QR code message
A2: Player <select> close
-> end ! ERROR
```

## PU003 - Execute action in the game world

```text
Use case Execute action in the game world Main scenario
00: Player <select> execute action
01: System <read> available actions
02: System <show> action list
03: Player <select> choose action
04: System <check> action conditions
[action conditions ? MET]
05: System <execute> action resolution rule
06: System <update> action effect request
07: System <show> action request confirmation
08: Player <select> ok
-> end ! OK
```
