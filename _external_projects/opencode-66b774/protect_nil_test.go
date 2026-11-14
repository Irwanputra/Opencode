package slowdns

import "testing"

func TestSetSocketProtectorNilDoesNotPanic(t *testing.T) {
	SetSocketProtector(nil)
}
