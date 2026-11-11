.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Landroid/view/View;

.field public final synthetic くし〴〺ぅ:Landroid/view/View;

.field public final synthetic びぐびあび:Landroidx/appcompat/app/AlertController;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V
    .registers 4

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぁごぐすすぃ;->びぐびあび:Landroidx/appcompat/app/AlertController;

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぁごぐすすぃ;->〺つふすそ:Landroid/view/View;

    iput-object p3, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぁごぐすすぃ;->くし〴〺ぅ:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぁごぐすすぃ;->びぐびあび:Landroidx/appcompat/app/AlertController;

    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->ぁごぐすすぃ:Landroid/widget/ListView;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぁごぐすすぃ;->〺つふすそ:Landroid/view/View;

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぁごぐすすぃ;->くし〴〺ぅ:Landroid/view/View;

    invoke-static {v0, v1, v2}, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
