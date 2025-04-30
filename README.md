 owner (public)
Überall zugreifbar – in jeder Klasse und jedem Package

Wird in allen 3 Klassen erfolgreich gelesen

❌ balance (private)
Nur innerhalb der Account-Klasse zugreifbar

Nicht sichtbar in AccountManager, ExternalAudit, CompanyAccount

✅ pin (protected)
Zugreifbar in:

der Klasse selbst

allen Subklassen, auch in anderen Packages

nicht zugreifbar in nicht-vererbenden Klassen (AccountManager, ExternalAudit)

✅ internalNote (default / package-private)
Nur im selben Package sichtbar

AccountManager kann es sehen (weil im selben Package)

ExternalAudit & CompanyAccount nicht, weil in anderen Packages# Mein Homework-Repo
