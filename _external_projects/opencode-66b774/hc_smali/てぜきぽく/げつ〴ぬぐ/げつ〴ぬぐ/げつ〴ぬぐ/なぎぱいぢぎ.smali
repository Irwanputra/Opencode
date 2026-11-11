.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 〺つふすそ:Landroid/widget/EditText;

.field public final synthetic くし〴〺ぅ:Lteam/dev/epro/apkcustom/MainActivity;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/MainActivity;Landroid/widget/EditText;)V
    .registers 3

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/MainActivity;

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 4

    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_28

    .line 1
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    const/high16 v0, -0x10000

    .line 2
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    const-string v1, "J3oOgmJ6>Oe9Adi@1j\u001cc;Kk<LfjNah\u001ed9M0fNk=Ncg\u001dj>OefM1fAjo\u0019klL6kM1j\u001d"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V

    return-void

    :cond_28
    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 3
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->〴ねぷぐくぼ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    .line 4
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;->dismiss()V

    return-void
.end method
