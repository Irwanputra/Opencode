.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic 〺つふすそ:Landroid/widget/EditText;

.field public final synthetic くし〴〺ぅ:Lteam/dev/epro/apkcustom/MainActivity;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/MainActivity;Landroid/widget/EditText;)V
    .registers 3

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/MainActivity;

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .registers 6

    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "J`hJ6m\u001b`>\u001e6gJdj\u001e6;\u0019foKci\u001edi\u001bbg\u001d`"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {v0, v1, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->へぬ〴づぞ(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 3
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 4
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v2

    .line 5
    sget-object v3, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lteam/dev/epro/apkcustom/MainActivity;->こ〲しでおか(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x16

    .line 6
    aget-object v0, v0, v2

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5a

    .line 7
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 8
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぷちぅぐね()V

    .line 9
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    const/high16 v0, -0x10000

    .line 10
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    const-string v2, "N3i\u001bdnNc:NdkJg:Ac>\u001dj>\u0019jhO`k\u001a0m\u001eb=@79\u001ek=Kfg\u001c3lK7mIk;Lf:\u001eb:\u001ed>M4oL"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V

    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/MainActivity;

    const/4 v0, 0x1

    .line 11
    invoke-virtual {p1, v0}, Lteam/dev/epro/apkcustom/MainActivity;->げがぴうあだ(Z)V

    .line 12
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v0, ""

    .line 13
    invoke-static {p1, v1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->へぬ〴づぞ(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5a
    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/MainActivity;

    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p1, Lteam/dev/epro/apkcustom/MainActivity;->かづげぃぁ〺:Z

    return-void
.end method
