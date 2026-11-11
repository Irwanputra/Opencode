.class public Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺふねづ〺;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Ljava/lang/String;

.field public final synthetic くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;


# direct methods
.method public constructor <init>(Lde/blinkt/openvpn/core/OpenVPNService;Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺふねづ〺;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    iput-object p2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺふねづ〺;->〺つふすそ:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 6

    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺふねづ〺;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 1
    iget-object v0, v0, Lde/blinkt/openvpn/core/OpenVPNService;->でどあくず:Landroid/widget/Toast;

    if-eqz v0, :cond_9

    .line 2
    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    :cond_9
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺふねづ〺;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 3
    iget-object v2, v2, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    .line 4
    iget-object v2, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    iget-object v4, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺふねづ〺;->〺つふすそ:Ljava/lang/String;

    aput-object v4, v1, v2

    const-string v2, "\u001aj<\u00193o\u001c`hK`gHd9\u001d7<\u001b4:Lc:\u001bd=N1i\u001df"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺふねづ〺;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {v1}, Landroid/net/VpnService;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 5
    iput-object v0, v1, Lde/blinkt/openvpn/core/OpenVPNService;->でどあくず:Landroid/widget/Toast;

    .line 6
    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺふねづ〺;->くし〴〺ぅ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 7
    iget-object v0, v0, Lde/blinkt/openvpn/core/OpenVPNService;->でどあくず:Landroid/widget/Toast;

    .line 8
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method
