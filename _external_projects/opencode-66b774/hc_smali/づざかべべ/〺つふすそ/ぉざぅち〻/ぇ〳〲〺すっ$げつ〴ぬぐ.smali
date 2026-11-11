.class public final Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final 〺つふすそ:Landroid/widget/TextView;

.field public final くし〴〺ぅ:Landroid/widget/ImageView;

.field public final げつ〴ぬぐ:Landroid/widget/TextView;

.field public final づざかべべ:Landroid/widget/ImageView;

.field public final びぐびあび:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x1020014

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/widget/TextView;

    const v0, 0x1020015

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->〺つふすそ:Landroid/widget/TextView;

    const v0, 0x1020007

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/widget/ImageView;

    const v0, 0x1020008

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->びぐびあび:Landroid/widget/ImageView;

    sget v0, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->edit_query:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->づざかべべ:Landroid/widget/ImageView;

    return-void
.end method
