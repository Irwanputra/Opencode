.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〺つふすそ:Landroid/view/View;

.field public final ぁごぐすすぃ:[I

.field public final くし〴〺ぅ:Landroid/widget/TextView;

.field public final げつ〴ぬぐ:Landroid/content/Context;

.field public final づざかべべ:Landroid/graphics/Rect;

.field public final なぎぱいぢぎ:[I

.field public final びぐびあび:Landroid/view/WindowManager$LayoutParams;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->びぐびあび:Landroid/view/WindowManager$LayoutParams;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->づざかべべ:Landroid/graphics/Rect;

    const/4 v1, 0x2

    new-array v2, v1, [I

    iput-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->なぎぱいぢぎ:[I

    new-array v1, v1, [I

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->ぁごぐすすぃ:[I

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lづざかべべ/〺つふすそ/ぁごぐすすぃ;->abc_tooltip:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->〺つふすそ:Landroid/view/View;

    sget v2, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->message:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->くし〴〺ぅ:Landroid/widget/TextView;

    const-class v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    const/16 p1, 0x3ea

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    const/4 p1, -0x2

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 p1, -0x3

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    sget p1, Lづざかべべ/〺つふすそ/ぺぁあねじ;->Animation_AppCompat_Tooltip:I

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    const/16 p1, 0x18

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 3

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    if-nez v0, :cond_e

    return-void

    .line 2
    :cond_e
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->げつ〴ぬぐ:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->〺つふすそ:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    return-void
.end method
