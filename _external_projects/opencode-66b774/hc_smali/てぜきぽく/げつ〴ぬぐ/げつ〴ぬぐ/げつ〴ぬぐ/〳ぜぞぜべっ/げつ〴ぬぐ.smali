.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

.field public final synthetic くし〴〺ぅ:Landroid/widget/EditText;

.field public final synthetic びぐびあび:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/activities/GeneratedConfig;Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;Landroid/widget/EditText;)V
    .registers 4

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iput-object p3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;->くし〴〺ぅ:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 6

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    .line 1
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    .line 2
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u0019eh\u001e`nJf<L`kO6>Ibl\u001bb>\u001eag\u001e6>\u001denM0;\u0019`o\u001b49\u001dd>Ab;HjnNg:\u001b7iAgo@`mKkmN"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2b

    .line 3
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 4
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_34

    :cond_2b
    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    .line 5
    sget-object v2, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    const/4 v3, 0x0

    .line 6
    invoke-virtual {v1, v2, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v1

    .line 7
    :goto_34
    iput-object v1, v0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ぉざぅち〻:Ljava/lang/String;

    .line 8
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    new-instance v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
