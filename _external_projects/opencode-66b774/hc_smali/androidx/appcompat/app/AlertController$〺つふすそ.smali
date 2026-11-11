.class public Landroidx/appcompat/app/AlertController$〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/AlertController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Landroid/content/DialogInterface$OnClickListener;

.field public final 〺つふすそ:Landroid/view/LayoutInflater;

.field public ぁごぐすすぃ:Ljava/lang/CharSequence;

.field public いいにぽつ:Landroid/content/DialogInterface$OnClickListener;

.field public ぇぬぎばつ:Landroid/view/View;

.field public ぉざぅち〻:Z

.field public おぐぴう〸ず:Landroid/content/DialogInterface$OnClickListener;

.field public くし〴〺ぅ:Landroid/graphics/drawable/Drawable;

.field public final げつ〴ぬぐ:Landroid/content/Context;

.field public ざとぅぼこ〺:I

.field public づざかべべ:Landroid/view/View;

.field public てぜきぽく:Landroid/content/DialogInterface$OnDismissListener;

.field public なぎぱいぢぎ:Ljava/lang/CharSequence;

.field public のぷのちつ:Landroid/content/DialogInterface$OnKeyListener;

.field public びぐびあび:Ljava/lang/CharSequence;

.field public へぬ〴づぞ:Landroid/widget/ListAdapter;

.field public ぺぁあねじ:Ljava/lang/CharSequence;

.field public ぺふねづ〺:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/appcompat/app/AlertController$〺つふすそ;->ざとぅぼこ〺:I

    iput-object p1, p0, Landroidx/appcompat/app/AlertController$〺つふすそ;->げつ〴ぬぐ:Landroid/content/Context;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぺふねづ〺:Z

    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Landroidx/appcompat/app/AlertController$〺つふすそ;->〺つふすそ:Landroid/view/LayoutInflater;

    return-void
.end method
