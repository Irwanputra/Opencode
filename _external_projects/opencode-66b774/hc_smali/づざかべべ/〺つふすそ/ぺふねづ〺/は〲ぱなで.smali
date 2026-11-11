.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/は〲ぱなで;
.super Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;-><init>()V

    return-void
.end method


# virtual methods
.method public へぼ〳〻び(Landroid/app/Dialog;I)V
    .registers 6

    instance-of v0, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;

    if-eqz v0, :cond_22

    move-object v0, p1

    check-cast v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1a

    const/4 v2, 0x2

    if-eq p2, v2, :cond_1a

    const/4 v2, 0x3

    if-eq p2, v2, :cond_11

    goto :goto_25

    :cond_11
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x18

    invoke-virtual {p1, p2}, Landroid/view/Window;->addFlags(I)V

    .line 1
    :cond_1a
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;->げつ〴ぬぐ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object p1

    invoke-virtual {p1, v1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ざっざへづ(I)Z

    goto :goto_25

    .line 2
    :cond_22
    invoke-super {p0, p1, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->へぼ〳〻び(Landroid/app/Dialog;I)V

    :goto_25
    return-void
.end method
